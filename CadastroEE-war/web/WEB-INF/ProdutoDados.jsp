<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dados do Produto</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="container">
<h1 class="my-4">Dados do Produto</h1>
<%
    cadastroee.model.Produto produto = (cadastroee.model.Produto) request.getAttribute("produto");
    String acao = (produto == null) ? "incluir" : "alterar";
%>
<form action="ServletProdutoFC" method="post" class="form">
    <input type="hidden" name="acao" value="<%= acao %>">
    <% if ("alterar".equals(acao)) { %>
        <input type="hidden" name="id" value="<%= produto.getIdproduto() %>">
    <% } %>
    <div class="mb-3">
        <label for="nome" class="form-label">Nome:</label>
        <input type="text" id="nome" name="nome" class="form-control" value="<%= (produto != null) ? produto.getNome() : "" %>">
    </div>
    <div class="mb-3">
        <label for="quantidade" class="form-label">Quantidade:</label>
        <input type="number" id="quantidade" name="quantidade" class="form-control" value="<%= (produto != null) ? produto.getQuantidade() : "" %>">
    </div>
    <div class="mb-3">
        <label for="preco" class="form-label">Preço de Venda:</label>
        <input type="text" id="preco" name="preco" class="form-control" value="<%= (produto != null) ? String.format("%.2f", produto.getPrecoVenda()) : "" %>">
    </div>
    <button type="submit" class="btn btn-primary">
        <%= (acao.equals("incluir")) ? "Adicionar Produto" : "Alterar Produto" %>
    </button>
</form>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
