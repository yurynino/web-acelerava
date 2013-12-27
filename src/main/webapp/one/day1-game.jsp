<head>
	<script src="../js/games.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			generateQuestion(0);
		});
	</script>
</head>
<body>
	<ul class="section">
		<li>
			<h1>
				<span>D&iacute;a 1</span> <a>A Jugar</a>
			</h1>
			<div class="information">
				<h4>Instrucciones</h4>
				Con el cursor del mouse se&ntilde;ala en el mapamundi la posici&oacute;n del continente u oc&eacute;ano solicitado.  
			</div>
			<div>
				<div class="information">
					<span id="question"></span>
					<input type="hidden" id="correct" value="" />
				</div>
				<div class="game">
					<div class="world-game-left" onclick="verifyAnswer('0')">
						<img id="image_0" src="/images/one/world-map-game-0.jpg">
					</div>
					<div class="world-game-left" onclick="verifyAnswer('1')">
						<img id="image_1" src="/images/one/world-map-game-1.jpg">
					</div>
					<div class="world-game-left" onclick="verifyAnswer('2')">
						<img id="image_2" src="/images/one/world-map-game-2.jpg">
					</div>
					<div class="world-game-left" onclick="verifyAnswer('3')">
						<img id="image_3" src="/images/one/world-map-game-3.jpg">
					</div>
					<div class="world-game-left" onclick="verifyAnswer('4')">
						<img id="image_4" src="/images/one/world-map-game-4.jpg">
					</div>
				</div>
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