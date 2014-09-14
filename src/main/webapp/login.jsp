<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<body>
	<h2>Bienvenido a Acelerava</h2>
	<ul>
		<li>
			<h1>
				<span></span> <a>Iniciar Sesi&oacute;n</a>
			</h1>
			
			<%
				String error = (String) request.getAttribute("error");
				if (error != null) {
			%>
				<div class="alert-error">
					<%=error %>
				</div>
			<%
				}
			%>
			
			<div class="information">Ingresa tu nombre de usuario y contrase&ntilde;a.</div>

			<form action="sign" method="POST">
				<table>
					<tr>
						<td>
							<label class="control-label" for="username">Nombre de usuario: </label>
						</td>
						<td>
							<input type="text" id="username" name="username" />
						</td>
					</tr>
					<tr>
						<td>
							<label class="control-label" for="password">Contrase&ntilde;a: </label>
						</td>
						<td>
							<input type="password" id="password" name="password" />
						</td>
					</tr>
					<tr>
						<td>
						</td>
						<td style="text-align: right;">
							<input type="submit" value="Ingresar" />
						</td>
					</tr>
				</table>
			</form>
		</li>
	</ul>
</body>