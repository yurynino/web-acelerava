<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<%@ page import="com.acelerava.domain.User" %>

<head>
	<title>Acelerava::Subproyecto 3</title>
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
					<%@include file="/decorators/components/reportMenu.jsp" %>
				</div>
				<div id="content">
					<p class="important">
						<%
							User user = (User) session.getAttribute("user");
						    if (user != null) {
							%>
								<a href="/">Inicio | </a>
								<a href="signout">Salir</a>
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