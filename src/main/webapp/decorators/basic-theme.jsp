<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page import="com.acelerava.domain.User" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Bienvenido::Acelerava</title>
	<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="background">
		<div id="page">
			<div id="body">
				<%
			    User user = (User) request.getAttribute("user");
			    if (user != null) {
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
						%>
							<a href="/">Inicio | </a>
							<a href="">Salir</a>
						<%
					    } else {
						%>
							<a href="sign">Iniciar Sesi&oacute;n</a>
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