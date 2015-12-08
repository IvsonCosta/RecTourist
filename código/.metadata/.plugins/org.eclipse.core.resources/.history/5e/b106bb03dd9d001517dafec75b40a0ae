<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../../css.jsp"></jsp:include>
<link rel="stylesheet" type="text/css"
	href="<c:url value="resources/css/admin/usuario.css" />" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>SchoolDrive</title>
</head>
<body>

	<jsp:include page="../topoAdmin.jsp"></jsp:include>

	<!-- Corpo da pagina -->
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="../MenuLateral.jsp"></jsp:include>

			<div class="col-md-7">


				<!-- mensagens -->
				<jsp:include page="../../mensagens.jsp">
					<jsp:param value="${tipo}" name="tipo" />
					<jsp:param value="${mensagens}" name="mensagens" />
				</jsp:include>


				<div class="row">
					<div class="col-md-5">
						<div class="page-header">
							<h2>Lista de Usuario</h2>
						</div>
					</div>
					<div class="col-md-offset-2 col-md-4">
						<div class="page-header">
							<div class="btn-group btn-group-justified">
								<a class="btn btn-default" href="formUsuario"> <span
									class="glyphicon glyphicon-plus"></span> Inserir
								</a> <a class="btn btn-default" href="listaUsuario"> <span
									class="glyphicon glyphicon-search"></span> Pesquisar
								</a>
							</div>
						</div>
					</div>
				</div>
				<br>
				
				<form class="form-inline" role="form">
					<div class="form-group">
						<label class="sr-only" for="email">Email</label> <input
							type="email" class="form-control" id="email" placeholder="Email">
					</div>
					<div class="form-group">
						<input class="form-control" type="text" placeholder="Nome">
					</div>
					<button type="submit" class="btn btn-default">Pesquisar</button>
				</form>
				<br> <br>


				<div class="table-responsive">
					<table class="table">
						<tr>
							<th>Nome</th>
							<th>sobrenome</th>
							<th>sexo</th>
							<th>Email</th>
							<th>Excluir</th>
						</tr>
						<tbody>
							<c:forEach var="usuario" items="${usuarios}">
								<tr>
									<td>${usuario.nome}</td>
									<td>${usuario.sobrenome}<br></td>
									<td>${usuario.sexo}</td>
									<td>${usuario.email}</td>
									<td align="center"><a type="button" href="excluirUsuario?id=${usuario.id}"
											class="btn btn-danger">
											<span class="glyphicon glyphicon-remove-sign"></span> Excluir
										</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>