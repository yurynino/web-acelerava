<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="com.acelerava.provider.EvaluationProvider" %>
<%@ page import="com.acelerava.domain.Question" %>

<%
	List<Question> questions = EvaluationProvider.getEvaluationOne();
	pageContext.setAttribute("questions", questions);
%>

<body>
	<ul class="section">
		<li>
			<h1>
				<span></span> <a>Evaluaci&oacute;n</a>
			</h1>
			<div class="information">
				Selecciona la respuesta correcta para cada una de las preguntas:
			</div>
			
			<form action="">
				<div class="question">
					<c:forEach items="${questions}" var="question">
						<b>${question.text}</b>
						<br />
						<c:forEach items="${question.options}" var="option" varStatus="status" >
							<input type="radio" name="option" value="${status.index}" /> ${option}
							<br>
						</c:forEach>
					</c:forEach>			
				</div>
			</form>
		</li>
	</ul>
</body>