<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Bienvenido::Acelerava</title>
	<meta charset="utf-8">
	<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="background">
		<div id="page">
			<div id="body">
				<%
				UserService userService = UserServiceFactory.getUserService();
			    User user = userService.getCurrentUser();
			    if (user != null) {
			        pageContext.setAttribute("user", user);
				%>
					<div id="basic-sidebar">
						<%@include file="/decorators/components/basicMenu.jsp" %>
					</div>
				<%
				} else {
				%>
					<div id="default-sidebar">
						<%@include file="/decorators/components/defaultMenu.jsp" %>
					</div>
				<%
				}
				%>
				<div id="content">
					<p class="important">
						<%
					    if (user != null) {
					        pageContext.setAttribute("user", user);
						%>
							<a href="/">Inicio | </a>
							<a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">Salir</a>
						<%
					    } else {
						%>
							<a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Iniciar Sesi&oacute;n</a>
						<%
					 	}
						%>
					</p>
					<div class="body">
						<div class="content">
							<decorator:body />
						</div>
					</div>
				</div>
			</div>
			<div id="footer">
				<%@include file="/decorators/components/footer.jsp" %>
			</div>
		</div>
	</div>
</body>
</html>