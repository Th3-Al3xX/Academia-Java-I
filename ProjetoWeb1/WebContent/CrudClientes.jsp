<%@page import="model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="control.ClienteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Clientes</title>
<style type="text/css">
tr.rows {
	cursor: pointer;
}
tr.rows.active td {
	background-color: #0d6efd;
}
tr.rows:hover {
	background-color: #0d6efd80;
}
button.page-link:disabled {
    background-color: lightgrey;
    color: gray;
}
</style>
</head>
<body>
<jsp:include page="Menu.jsp"></jsp:include>
<jsp:useBean id="cd" class="control.ClienteDAO"></jsp:useBean>

<h1>Cadastro de Clientes</h1>
<div class="container">
<nav class="navbar navbar-light bg-light justify-content-between">
  <form method="get" class="form-inline">
  <% 
	//ClienteDAO cd =  new ClienteDAO();
  
	String auxPesquisa=request.getParameter("pesquisa");
	if (auxPesquisa == null) auxPesquisa="";
	
	String auxId=request.getParameter("id");
	String auxNome=request.getParameter("nome");
	String auxTelefone=request.getParameter("telefone");

	String auxGravar=request.getParameter("gravar");
	String auxCancelar=request.getParameter("cancelar");
	String auxApagar=request.getParameter("apagar");

	String auxAnterior=request.getParameter("anterior");
	String auxProximo=request.getParameter("proximo");

	String aux=request.getParameter("pagina");
	int auxPagina=1;
	if (aux!=null) auxPagina=Integer.parseInt(aux);
	if (auxPagina<1) auxPagina=1;
	
	if (auxAnterior !=null) {
		if (auxPagina>1) cd.setPageNumber(auxPagina-1);
	}
	if (auxProximo !=null) {		
		cd.setPageNumber(auxPagina+1);
	}
	
	String auxMethod=request.getMethod();
	
	if (auxGravar!=null) {
		if (auxId==null) auxId="0";
		if (auxId=="") auxId="0";
		cd.gravar(new Cliente(Integer.parseInt(auxId),auxNome,auxTelefone));
	} else if (auxCancelar!=null) {
		
	} else if (auxApagar!=null) {
		if (auxId==null) auxId="0";
		if (auxId=="") auxId="0";
		if (auxId!="0")
			cd.excluir(Integer.parseInt(auxId));
	}
	
	%>
    <input class="form-control mr-sm-2" 
    		type="search" 
    		placeholder="Pesquisar cliente..." 
    		aria-label="Pesquisar"
    		name="pesquisa"
    		value="<% out.print(auxPesquisa); %>">
  </form>
  <button type="button" 
  		  class="btn btn-primary"
  		  id="btIncluir"
  		  onclick="limpar()"><i class="fas fa-user-plus"></i>&nbsp;Incluir Cliente</button>
</nav>
  <div class="row">
    <div class="col-sm">
		<table id="tabelaClientes" class="table">
		  <tr>
		    <th>ID</th>
		    <th>Nome</th>
		    <th>Telefone</th>
		  </tr>

			<%
			
			ArrayList<Cliente> cli = cd.pesquisar(auxPesquisa);
			
			for (Cliente cliente : cli) {		
				out.println("<tr class='rows'>");
				out.println("<td>"+cliente.getId().toString()+"</td>");
				out.println("<td>"+cliente.getNome()+"</td>");
				out.println("<td>"+cliente.getTelefone()+"</td>");
				out.println("</tr>");
			}
			%>		  
		  
		  </tr>
		</table>
		<form method="post" 
			id="formPaginate" name="formPaginate">
			<nav aria-label="Page navigation example">
			  <ul class="pagination">
			    <li class="page-item">
			    <button name="anterior" 
			    		type="submit" 
			    		<% 
			    			if (cd.getPageNumber() <= 1)
			    				out.print("disabled");
			    		%>			    		
			    		class="page-link"><i class="fas fa-backward"></i>&nbsp;Anterior</button></li>
			    <input type="text" class="form-control" 
		    		id="pagina"
		    		name="pagina"
		    		value="<% out.print(cd.getPageNumber()); %>"
		    		readonly>		  			
			    <li class="page-item">
			    	<button 
			    		name="proximo" 
			    		type="submit"
			    		<% 
			    			if (cd.getPageNumber() >= cd.getMaxPages())
			    				out.print("disabled");
			    		%>
			    		class="page-link" >Pr??xima&nbsp;<i class="fas fa-forward"></i></button>
			    </li>
			  </ul>
			</nav>
		</form>
    </div>
    <div class="col-sm">
		<form method="post" 
			id="formCliente" name="formCliente">
		  <div class="form-group">
		    <label for="codigoInput">C??digo</label>
		    <input type="text" class="form-control" 
		    		id="codigoInput"
		    		name="id" 
		           placeholder="C??digo do Cliente"
		           readonly>
		  </div>
		  <div class="form-group">
		    <label for="nomeInput">Nome</label>
		    <input type="text" class="form-control" 
		    		id="nomeInput"
		    		name="nome" 
		           placeholder="Nome do Cliente">
		  </div>
		  <div class="form-group">
		    <label for="telefoneInput">Telefone</label>
		    <input type="text" class="form-control" 
		    	   id="telefoneInput"
		    	   name="telefone" 
		           aria-describedby="telefoneHelp" placeholder="Telefone do Cliente">
 			<small id="telefoneHelp" class="form-text text-muted">Informe o telefone no formato (##) # ####-####</small>
 		  </div>
			<nav class="navbar navbar-light bg-light">
			  <button name="gravar" type="submit" class="btn btn-success"><i class="fas fa-save"></i>&nbsp;Gravar</button>
			  <button name="cancelar" type="submit" class="btn btn-secondary"><i class="fas fa-window-close"></i>&nbsp;Cancelar</button>
			  <button id="novoApagar" class="btn btn-danger btn-right"><i class="fas fa-trash-alt"></i>&nbsp;Apagar</button>
			  <button id="apagar" name="apagar" type="submit" style="display:none" ></button>
			</nav> 		  
		</form>
    </div>
  </div>
</div>
</body>
<script>
$("tr.rows").click(function(evento){
	$("tr.rows").removeClass("active");
	$(this).addClass("active");
	var id=$($(this).find("td")[0]).text();
	var nome=$($(this).find("td")[1]).text();
	var telefone=$($(this).find("td")[2]).text();
	$("#codigoInput").val(id);
	$("#nomeInput").val(nome);
	$("#telefoneInput").val(telefone);
});
//$("#btIncluir").click(function(evento){
//	$("tr.rows").removeClass("active");
//	$("#codigoInput").val("");
//	$("#nomeInput").val("");
//	$("#telefoneInput").val("");
//});
function limpar(){
	$("tr.rows").removeClass("active");
	$("#codigoInput").val("");
	$("#nomeInput").val("");
	$("#telefoneInput").val("");
}
$("#novoApagar").click(function(evento){
	evento.preventDefault();
	confirmaApagar();
});
function confirmaApagar(){
	$.confirm({
	    title: 'Exclus??o de Cliente',
	    content: 'Deseja realmente apagar este cliente?',
	    buttons: {
	        confirma: {
	            text: 'Apagar',
	            btnClass: 'btn-danger',
	            action: function(){
	            	//$("#apagar").click();
	            	let auxUrl=window.location;
	            	let auxId=$("#codigoInput").val();
	            	let auxDados={
	            			id: auxId,
	            			apagar:''
	            	}
	            	$.post(auxUrl,auxDados, function(data){
	            		location.reload();
	            	});
	            }
	        },
	        cancela: {
	            text: 'N??o Apagar',
	            btnClass: 'btn-secondary',
	            action: function(){
	                
	            }
	        }
	    }
	});
}
</script>
</html>