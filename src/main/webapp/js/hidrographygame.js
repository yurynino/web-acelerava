function verifyAnswer3() {
	var numQuestion = $("#num-question");
	var elem = $('input[name=answers]:checked', '#hidrography-form');
	verify(numQuestion.val(), elem.val());
}

function verify(numQuestion, answer) {
	var correct = ["1", "2", "2", "4", "3", "1", "1", "4" ];
	
	if (correct[numQuestion] == answer) {
		if (numQuestion < 7) {
			alert("Muy bien, ahora prueba con otro río");
		} else {
			alert("Muy bien, Terminaste!!!");
		}

		// Update score
		var newScore = parseFloat($("#score").html()) + 1.25;
		$("#score").html(newScore);
		
		// Change question
		var nextQuestion = parseInt(numQuestion) + 1;
		updateQuestion(nextQuestion);
	
		$("#num-question").val(nextQuestion);
		
	} else {
		alert("Respuesta Incorrecta: Intentalo de nuevo.");
	}
}

function updateQuestion(nextQuestion) {
	var tokens = [	"",
					"R&iacute;o San Juan$R&iacute;o Cauca$R&iacute;o Atlantico$R&iacute;o Pac&iacute;fico", 
	               	"R&iacute;o Caribe$R&iacute;o Magdalena$R&iacute;o Atlantico$R&iacute;o Pac&iacute;fico",
	               	"R&iacute;o Cavo Norte$R&iacute;o Sur$R&iacute;o Atlantico$R&iacute;o Meta",
	               	"R&iacute;o Atrato$R&iacute;o Iliana$R&iacute;o Guaviare$R&iacute;o Norte",
	               	"R&iacute;o Inirida$R&iacute;o Cauca$R&iacute;o Atlantico$R&iacute;o Pac&iacute;fico",
	               	"R&iacute;o Vaup&eacute;s$R&iacute;o Cauca$R&iacute;o Guayabo$R&iacute;o Catatumbo",
	               	"R&iacute;o Mit&uacute$R&iacute;o Cauca$R&iacute;o Amazonas$R&iacute;o Caquet&aacute"];
	
	if (nextQuestion < 8) {
		$("#hidrography-image").empty();
		$("#hidrography-image").append("<img id=\"image\" src=\"/images/one/hidrography" + nextQuestion + ".gif\" width=\"50%\">");
		
		$("#options").empty();
		var token = tokens[nextQuestion];
		var options = token.split("$");
		for (var i = 0; i < options.length; i++) {
			var option = options[i];
			$("#options").append("<input type=\"radio\" name=\"answers\" value=\"" + (i + 1) + "\"> " + option + " <br/>");
		}
	}
}