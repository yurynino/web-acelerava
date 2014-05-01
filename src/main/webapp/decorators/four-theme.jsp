<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>

<head>
	<title>Acelerava::Subproyecto 4</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="../css/style.css" >
	<script type="text/javascript" src="../js/jquery-1.10.2.min.js"></script>
	<decorator:head />
</head>
<body>
	<div id="background">
		<div id="page">
			<div id="body">
				<div id="section-sidebar">
					<%@include file="/decorators/components/fourMenu.jsp" %>
				</div>
				<div id="content">
					<p class="important">
						<%
						UserService userService = UserServiceFactory.getUserService();
					    User user = userService.getCurrentUser();
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