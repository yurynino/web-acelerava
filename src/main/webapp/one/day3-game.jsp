<head>
	<link href="../css/hidrographygame.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="../js/hidrographygame.js"></script>
</head>
<body>
	<ul class="section">
		<li>
			<h1>
				<span>D&iacute;a 3</span> <a>A Jugar</a>
			</h1>
			<div class="information">
				<h4>Instrucciones</h4>
				Selecciona el nombre el nombre del r&iacute;o que corresponde con la imagen.  
			</div>
			<div id="hidrography-image" align="center">
				<img id="image" src="/images/one/hidrography0.gif" width="50%">
			</div>
			<div class="div-options">
				<h4>Opciones</h4>
				<form id="hidrography-form">
					<div id="options">
						<input type="radio" name="answers" value="1"> R&iacute;o Atrato <br/>
						<input type="radio" name="answers" value="2"> R&iacute;o Amazonas <br/>
						<input type="radio" name="answers" value="3"> R&iacute;o Lateral <br/>
						<input type="radio" name="answers" value="4"> R&iacute;o Pac&iacute;fico <br/>
					</div>
					<input type="hidden" id="num-question" value="0">
				</form>
			</div>
			<div>
				<input type="submit" id="verify-answer" value="Enviar" onclick="verifyAnswer2()" />
			</div>
			<div class="information">
				<h4>Calificaci&oacute;n: <span id="score">0</span></h4>
			</div>
		</li>
		<li>
			<h2>
				<a href="/one/day1-content.jsp">Regresar</a>
			</h2>
		</li>
	</ul>
</body>