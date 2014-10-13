<head>
   	<script type="text/javascript" src="../js/jquery-1.6.2.min.js"></script>
    <script type="text/javascript" src="../js/jquery-ui-1.8.16.custom.min.js"></script>
    <script type="text/javascript" src="../js/jquery.wordsearchgame.js"></script>
    <link  rel="stylesheet" type="text/css" href="../css/jquery.wordsearchgame.css">
	
	<script>
		$(document).ready( function () {
			var words = "amazonas,antioquia,atlantico,bolivar,boyaca,caldas,casanare,cauca,cesar,"+
						"choco,guainia,huila,guaviare,meta,putumayo,risaralda,santander,sucre,tolima,vichada";
			$("#theGrid").wordsearchwidget({"wordlist" : words,"gridsize" : 15});
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
			<div id="theGrid"></div>
		</li>
	</ul>
</body>