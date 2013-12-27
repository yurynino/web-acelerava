function generateQuestion(index) {
	var questions = [	"&iquest;Donde est&aacute; ubicado el continente Am&eacute;rica?", 
						"&iquest;Donde est&aacute; ubicado el continente Europa?",
						"&iquest;Donde est&aacute; ubicado el continente Asia?",
						"&iquest;Donde est&aacute; ubicado el continente &Aacute;frica?",
						"&iquest;Donde est&aacute; ubicado el continente Ocean&iacute;a?"];

	var correctEl = $("#correct");
	correctEl.val(index);
	
	var questionEl = $("#question");
	questionEl.html(questions[index]);
	
}

function verifyAnswer(answer) {
	var correctEl = $("#correct");
	
	if (correctEl.val() == answer) {
		
		// Update image in color
		var imgEl = $("#image_" + answer);
		imgEl.attr("src", "/images/one/world-map-color-game-" + answer + ".jpg");
		
		alert("Respuesta Correcta: Muy bien!!!");
		
		// Update score
		var score = (parseInt(answer) + 1) * 2;
		var scoreEl = $("#score");
		scoreEl.html(score);
		
		// Update next question
		var nextIndex = parseInt(answer) + 1;
		generateQuestion(nextIndex);
		
	} else {
		
		alert("Respuesta Incorrecta: Intentalo de nuevo.");
	}
}