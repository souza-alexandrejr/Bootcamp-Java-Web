<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Processa Produto</title>
	<!--     Fonts and icons     -->
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
	<!-- CSS Files -->
	<link href="assets/css/material-dashboard.css?v=2.1.1" rel="stylesheet" />
	<!-- CSS Just for demo purpose, don't include it in your project -->
	<link href="assets/demo/demo.css" rel="stylesheet" />
</head>
<body>
<%
	String nome = request.getParameter("nome");
	if (nome.isEmpty())
		nome = "CAMPO OBRIGATÓRIO!";
	
	String descricao = request.getParameter("descricao");
	if (descricao.isEmpty())
		descricao = "CAMPO OBRIGATÓRIO!";
	
	String categoria = request.getParameter("categoria");
	if (categoria.isEmpty())
		categoria = "CAMPO OBRIGATÓRIO!";
	
	String fornecedor = request.getParameter("fornecedor");
	if (fornecedor.isEmpty())
		fornecedor = "CAMPO OBRIGATÓRIO!";
	
	String observacoes = null;
	observacoes = request.getParameter("observacoes");
	
	String unidade = null;
	unidade = request.getParameter("unidade");
	
	String custo = request.getParameter("custo");
	if (custo.isEmpty())
		custo = "CAMPO OBRIGATÓRIO!";
	else
	{
		Double valorCusto = Double.parseDouble(custo);
		if (valorCusto < 1)
			custo = "O valor do custo não pode ser inferior a 1!";
		else
			custo = valorCusto.toString();
	}
		
	String precoVenda = request.getParameter("precovenda");
	if (precoVenda.isEmpty())
		precoVenda = "CAMPO OBRIGATÓRIO!";
	else
	{
		Double valorVenda = Double.parseDouble(precoVenda);
		Double valorCusto = Double.parseDouble(custo);
		if (valorVenda >= 0.1*valorCusto)
			precoVenda = valorVenda.toString();
		else
			precoVenda = "O valor do preço de venda não pode ser inferior a 10% do custo!";
	}
	
%>
	<div class="content">
        <div class="container-fluid">
          <div class="card">
            <div class="card-header card-header-primary">
              <h3 class="card-title">Tratamento de Parâmetros</h3>
            </div>
            <div class="card-body">
              <div class="row">
                <div class="col-md-6">
                  <h4 class="card-title">Parâmetros Recebidos</h4>
                 <div class="alert alert-info">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> NOME - </b> <% out.write(nome); %></span>
                 </div>
                 <div class="alert alert-success">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> DESCRIÇÃO - </b> <% out.print(descricao); %> </span>
                 </div>
                 <div class="alert alert-warning">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> CATEGORIA - </b> <% out.print(categoria); %> </span>
                 </div>
                 <div class="alert alert-danger">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> FORNECEDOR - </b> <% out.print(fornecedor); %> </span>
                 </div>
                 <div class="alert alert-primary">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> OBSERVAÇÕES - </b> <% out.print(observacoes); %> </span>
                 </div>
                 <div class="alert alert-info">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> UNIDADE - </b> <% out.print(unidade); %> </span>
                 </div>
                 <div class="alert alert-success">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> CUSTO - </b> <% out.print(custo); %>
                   </span>
                 </div>
                 <div class="alert alert-warning">
                   <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                     <i class="material-icons">close</i>
                   </button>
                   <span>
                     <b> PREÇO DE VENDA - </b> <% out.print(precoVenda); %>
                   </span>
                 </div>
               </div>
             </div>
           </div>
         </div>
      </div>
   </div>
</body>
</html>