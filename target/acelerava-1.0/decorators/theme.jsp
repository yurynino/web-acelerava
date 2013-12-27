<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
				<div id="sidebar">
					<ul>
						<li>
							<a href="index.html">Subproyecto 1<span>Colombia en Mapas</span></a>
						</li>
						<li>
							<a href="index.html">Subproyecto 2<span>Colombia Cultural</span></a>
						</li>
						<li>
							<a href="index.html">Subproyecto 3<span>Colombia Regional</span></a>
						</li>
						<li>
							<a href="index.html">Subproyecto 4<span>Yo Soy Colombia</span></a>
						</li>
					</ul>
				</div>
				<div id="content">
					<div class="body">
						<div class="content">
							<decorator:body />
						</div>
					</div>
				</div>
			</div>
			<div id="footer">
				<div class="footnote">
					<a href="http://www.unad.edu.co/">Universidad Nacional Abierta y a Distancia</a><br/>
					&copy; 2013 Todos los Derechos Reservados.<br/>
					Carmenza Roa
				</div>
			</div>
		</div>
	</div>
</body>
</html>