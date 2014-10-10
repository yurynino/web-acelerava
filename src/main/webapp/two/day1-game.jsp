<head>
	<link rel="stylesheet" href="../css/jquery-ui.css" type="text/css">
	<link rel="stylesheet" href="/resources/demos/style.css" type="text/css">
	<style>
		#draggable {
			width: 100px;
			height: 100px;
			padding: 0.5em;
			float: left;
			margin: 10px 10px 10px 0;
		}
		#droppable {
			width: 150px;
			height: 150px;
			padding: 0.5em;
			float: left;
			margin: 10px;
		}
	</style>
	<script>
		$(function() {
			$("#draggable").draggable();
			$("#droppable").droppable({
				drop : function(event, ui) {
					$(this).addClass("ui-state-highlight").find("p").html("Dropped!");
				}
			});
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
					<span id="question"></span> <input type="hidden" id="correct" value="" />
				</div>
				<div id="draggable" class="ui-widget-content">
					<p>Drag me to my target</p>
				</div>

				<div id="droppable" class="ui-widget-header">
					<p>Drop here</p>
				</div>
			</div>
			<div class="information">
				<h4>
					Calificaci&oacute;n: <span id="score">0</span>
				</h4>
			</div>
		</li>
		<li>
			<h2>
				<a href="/two/day1-content.jsp">Regresar</a>
			</h2>
		</li>
	</ul>
</body>