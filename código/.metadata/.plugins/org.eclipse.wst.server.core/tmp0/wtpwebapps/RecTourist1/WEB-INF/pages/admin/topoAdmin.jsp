<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<sec:authorize access="isAuthenticated()">
	<div class="container-fluid">
		<nav class="navbar navbar-default " role="navigation">
			<div class="container">

				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Navegação</span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="home"><span class="glyphicon glyphicon-book"></span> ShoolDrive</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<!-- Links Principais -->
						
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="recuo">
						<p class="navbar-text">
								<a href="<c:url value="/j_spring_security_logout"/>" class="navbar-link"><span
									class="glyphicon glyphicon-log-out"></span> Sair</a>
						</p></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
		</nav>
	</div>
</sec:authorize>