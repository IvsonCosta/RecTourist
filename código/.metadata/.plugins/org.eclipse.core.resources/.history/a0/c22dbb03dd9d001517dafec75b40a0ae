<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:if test="${not empty tipo}">
	<div class="alert alert-${tipo}">
		<button type="button" class="close" data-dismiss="alert">&times;</button>
		<c:if test="${! empty mensagens}">
				${mensagens}
				<br />
		</c:if>
	</div>
</c:if>