<head>
	<script type="text/javascript" src="../js/holidaygame.js"></script>
</head>
<body>
	<ul class="section">
		<li>
			<h1>
				<span>D&iacute;a 3</span> <a>A Jugar</a>
			</h1>
			<div class="information">
				<h4>Instrucciones</h4>
				Selecciona el nombre el nombre de la feria a la que corresponde la imagen.  
			</div>
			<div id="holiday-image" align="center">
				<img id="image" src="/images/two/holiday0.jpg" width="50%">
			</div>
			<div class="div-options">
				<h4>Opciones</h4>
				<form id="holiday-form">
					<div id="options">
						<input type="radio" name="answers" value="1"> Carnaval de Barranquilla <br/>
						<input type="radio" name="answers" value="2"> Carnaval de Atl&aacute;ntico <br/>
						<input type="radio" name="answers" value="3"> Feria de la Costa <br/>
						<input type="radio" name="answers" value="4"> Feria de Manizales <br/>
					</div>
					<input type="hidden" id="num-question" value="0">
				</form>
			</div>
			<div>
				<input type="submit" id="verify-answer" value="Enviar" onclick="verifyAnswer3()" />
			</div>
			<div class="information">
				<h4>Calificaci&oacute;n: <span id="score">0</span></h4>
			</div>
		</li>
		<li>
			<h2>
				<a href="/two/day3-content.jsp">Regresar</a>
			</h2>
		</li>
	</ul>
</body>