<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page import="com.acelerava.domain.User" %>

<body>
	<h2>Bienvenido a Acelerava</h2>
	<ul>
		<li>
			<h3>
				<%
					User user = (User) session.getAttribute("user");
					if (user != null) {
				%>
						Bienvenido <%=user.getRol() %> <%=user.getName() %>
				<%
					}
				%>
			</h3>
		</li>
		<li>
			<p>
				<b>Acelerava</b> es un Ambiente Virtual de Aprendizaje para el
				Programa de Aceleraci&oacute;n del Aprendizaje. Aqu&iacute;
				encuentras los contenidos, actividades y juegos del m&oacute;dulo <b>La
					Colombia de Todos Nosotros</b>.
			</p>
		</li>
		<li>
			<p>Durante este proyecto vas a reconocer a Colombia como un
				pa&iacute;s diverso, que se ha enriquecido con los aportes
				hist&oacute;ricos y culturales de cada generaci&oacute;n.
				Aprender&aacute;s a interpretar mapas, identificar&aacute;s
				manifestaciones culturales y analizar&aacute;s las costumbres,
				sentimientos, pensamientos y tradiciones de los pueblos.</p>
		</li>
	</ul>
</body>