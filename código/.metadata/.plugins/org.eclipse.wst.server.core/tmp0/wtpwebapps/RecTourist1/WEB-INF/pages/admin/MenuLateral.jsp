<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div class="col-md-2">
	<ul class="nav nav-pills nav-stacked">
		<li id="topoMenu" class="active"><a><span></span>Menu</a></li>
		<li id="menu-lateral"><a href="formUsuario"><span
				class="glyphicon glyphicon-user"> </span> Usuario</a></li>
		<li id="menu-lateral"><a href="formSemestre"><span
				class="glyphicon glyphicon-calendar"> </span> Semestre</a></li>
		<li id="menu-lateral"><a href="formCurso"><span
				class="glyphicon glyphicon-th-list"> </span> Curso</a></li>
		<li id="menu-lateral"><a href="formDisciplina"><span
				class="glyphicon glyphicon-th-large"> </span> Disciplina</a></li>
		<li id="menu-lateral"><a href="formAlocarProfessor"><span
				class="glyphicon glyphicon-briefcase"> </span> Alocar Professor</a></li>
	</ul>
</div>
