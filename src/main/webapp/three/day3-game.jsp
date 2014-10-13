<head>
   	<script type="text/javascript" src="../js/jquery-1.6.2.min.js"></script>
    <script type="text/javascript" src="../js/jquery-ui-1.8.16.custom.min.js"></script>
    <script type="text/javascript" src="../js/jquery.wordsearchgame.js"></script>
    <link  rel="stylesheet" type="text/css" href="../css/jquery.wordsearchgame.css">
	
	<script>
		$(document).ready( function () {
			var words = "abozao,currulao,llorona,dorado,mohan,madremonte,sombreron,"+
						"pasillo,cumbia,patasola,sanjuanero,torbellino,bambuco,guabina";
			$("#theGrid").wordsearchwidget({"wordlist" : words,"gridsize" : 15});
		});
     </script>
</head>
<body>
	<ul class="section">
		<li>
			<h1>
				<span>D&iacute;a 3</span> <a>A Jugar</a>
			</h1>
			<div class="information">
				<h4>Instrucciones</h4>
				Con el cursor del mouse ubica en la sopa de letras los nombres de los bailes y mitos colombianos.  
			</div>
			<div id="theGrid"></div>
		</li>
		<li>
			<h2>
				<a href="/two/day3-content.jsp">Regresar</a>
			</h2>
		</li>
	</ul>
</body>