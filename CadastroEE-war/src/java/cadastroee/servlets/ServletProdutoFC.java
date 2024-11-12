package cadastroee.servlets;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import cadastroee.model.Produto;
import cadastroee.controller.ProdutoFacadeLocal;

@WebServlet(name = "ServletProdutoFC", urlPatterns = {"/ServletProdutoFC"})
public class ServletProdutoFC extends HttpServlet {

    @EJB
    private ProdutoFacadeLocal facade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("acao");
        String destino;

        try {
            switch (acao) {
                case "listar":
                    List<Produto> produtos = facade.findAll();
                    request.setAttribute("produtos", produtos);
                    destino = "ProdutoLista.jsp";
                    break;

                case "formIncluir":
                case "formAlterar":
                    destino = "ProdutoDados.jsp";
                    if ("formAlterar".equals(acao)) {
                        String idStr = request.getParameter("id");
                        if (idStr != null) {
                            int id = Integer.parseInt(idStr);
                            Produto produto = facade.find(id);
                            request.setAttribute("produto", produto);
                        }
                    }
                    break;

                case "incluir":
                    Produto novoProduto = new Produto();
                    novoProduto.setNome(request.getParameter("nome"));
                    novoProduto.setPrecoVenda(Float.valueOf(request.getParameter("preco")));
                    facade.create(novoProduto);
                    request.setAttribute("produtos", facade.findAll());
                    destino = "ProdutoLista.jsp";
                    break;

                case "alterar":
                    String idStrAlterar = request.getParameter("id");
                    if (idStrAlterar != null) {
                        int idAlterar = Integer.parseInt(idStrAlterar);
                        Produto produtoAlterar = facade.find(idAlterar);
                        produtoAlterar.setNome(request.getParameter("nome"));
                        produtoAlterar.setPrecoVenda(Float.valueOf(request.getParameter("preco")));
                        facade.edit(produtoAlterar);
                    }
                    request.setAttribute("produtos", facade.findAll());
                    destino = "ProdutoLista.jsp";
                    break;

                case "excluir":
                    String idStrExcluir = request.getParameter("id");
                    if (idStrExcluir != null) {
                        int idExcluir = Integer.parseInt(idStrExcluir);
                        Produto produtoExcluir = facade.find(idExcluir);
                        facade.remove(produtoExcluir);
                    }
                    request.setAttribute("produtos", facade.findAll());
                    destino = "ProdutoLista.jsp";
                    break;

                default:
                    destino = "ProdutoLista.jsp";
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            destino = "errorPage.jsp";
        }

        // Redireciona para o destino usando RequestDispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "ServletProdutoFC para gerenciamento de produtos com Front Controller";
    }
}
