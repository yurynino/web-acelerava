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
			
			<c:if test="">
			</c:if>
			<div class="information">
				Selecciona la respuesta correcta para cada una de las preguntas:
			</div>
			
			<form action="evaluation" method="POST">
				<c:forEach items="${questions}" var="question">
					<div class="question">
						<b>${question.number} ${question.text}</b>
						<br />
						<c:forEach items="${question.options}" var="option" varStatus="status" >
							<input type="radio" name="answer_${question}" value="${status.index}" /> ${option}
							<br>
						</c:forEach>
					</div>
				</c:forEach>
				<div>
					<input type="hidden" name="evaluation" value="one">
					<input type="submit" />
				</div>
			</form>
		</li>
	</ul>
</body>