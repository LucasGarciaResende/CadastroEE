<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Produtos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="container">
<h1 class="my-4">Lista de Produtos</h1>
<a href="ServletProdutoFC?acao=formIncluir" class="btn btn-primary m-2">Incluir Novo Produto</a>
<table class="table table-striped">
    <thead class="table-dark">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Quantidade</th>
            <th>Preço</th>
            <th>Ações</th>
        </tr>
    </thead>
    <tbody>
        <% 
            List<cadastroee.model.Produto> produtos = (List<cadastroee.model.Produto>) request.getAttribute("produtos");
            if (produtos != null) {
                for (cadastroee.model.Produto produto : produtos) {
        %>
        <tr>
            <td><%= produto.getIdproduto() %></td>
            <td><%= produto.getNome() %></td>
            <td><%= produto.getQuantidade() %></td>
            <td><%= String.format("%.2f", produto.getPrecoVenda()) %></td>
            <td>
                <a href="ServletProdutoFC?acao=formAlterar&id=<%= produto.getIdproduto() %>" class="btn btn-primary btn-sm">Alterar</a>
                <a href="ServletProdutoFC?acao=excluir&id=<%= produto.getIdproduto() %>" 
                   class="btn btn-danger btn-sm"
                   onclick="return confirm('Tem certeza que deseja excluir este produto?');">Excluir</a>
            </td>
        </tr>
        <% 
                }
            } else {
        %>
        <tr>
            <td colspan="5">Nenhum produto encontrado.</td>
        </tr>
        <% } %>
    </tbody>
</table>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
