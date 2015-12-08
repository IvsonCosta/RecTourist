$(document).ready(function() {
	$("#divCurso").hide();
	$("#target").blur(function() {
		if(this.value == "ROLE_ALUNO"){
			$("#divCurso").show();
		}else{
			$("#divCurso").hide();
		}
	});
});