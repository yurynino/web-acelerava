<head>
    <script type="text/javascript" src="../js/jquery-1.6.2.min.js"></script>
    <script type="text/javascript" src="../js/jquery-ui-1.8.16.custom.min.js"></script>
    <script type="text/javascript" src="../js/wordsearchgame.js"></script>
    <script type="text/javascript" src="../js/jquery.ui.touch-punch.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../css/wordsearchgame.css" >
	
	<script>
		$(document).ready(function(){
			var words = "Amazonas,Antioquia,Atlantico,Bolivar,Boyaca,Caldas,Casanare,Cauca,Cesar,Choco,"+
						"Guainia,Guaviare,Huila,Meta,Putumayo,Risaralda,Santander,Sucre,Tolima,Vichada";
			$("#theGrid").wordsearchwidget({"wordlist" : words,"gridsize" : 12,"addIndex" : 13});
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
				Con el cursor del mouse ubica en la sopa de letras los nombres de los departamentos.  
			</div>
			<div id="theGrid">
			</div>
		</li>
	</ul>
</body>