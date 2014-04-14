<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<body>
	<h2>Bienvenido a Acelerava</h2>
	<%
	UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();
    if (user != null) {
        pageContext.setAttribute("user", user);
	%>
		<p>
			Hola, ${fn:escapeXml(user.nickname)}! (You can <a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">sign out</a>.)
		</p>
		<ul>
			<li>
				<p>
					<b>Acelerava</Sb> es un Ambiente Virtual de Aprendizaje para el
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
	<%
	} else {
	%>
		<ul>
			<li>
				<p>Hola, para hacer uso de los servicios de <b>Acelerava</b>, debes autenticarte con tu nombre de usuario
					y contrase&ntilde;a <a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Aqu&iacute;</a>.
				</p>
			</li>
		</ul>
	<%
 	}
	%>
</body>