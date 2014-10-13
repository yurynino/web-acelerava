function verifyAnswer3() {
	var numQuestion = $("#num-question");
	var elem = $('input[name=answers]:checked', '#holiday-form');
	verify(numQuestion.val(), elem.val());
}

function verify(numQuestion, answer) {
	var correct = ["1", "3", "2", "1", "4"];
	
	if (correct[numQuestion] == answer) {
		if (numQuestion < 5) {
			alert("Muy bien, ahora prueba con otra feria");
		} else {
			alert("Muy bien, Terminaste!!!");
		}

		// Update score
		var newScore = parseFloat($("#score").html()) + 2;
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
					"Feria de Medell&iacute;n$Feria de Artesanos$Feria de las Flores$Feria de Antioquia", 
	               	"Fiesta de San Pedro$Feria de Cali$Fiesta de San Juan$Fiesta de Nari&ntilde;o",
	               	"Festival de Blancos y Negros$Feria de Pasto$Carnaval de Grises$Fiesta de las Flores",
	               	"Feria de Barranquilla$Fiesta de Toros$Concurso de Guaviare$Festival Vallenato"];
	
	if (nextQuestion < 6) {
		$("#holiday-image").empty();
		$("#holiday-image").append("<img id=\"image\" src=\"/images/two/holiday" + nextQuestion + ".jpg\" width=\"50%\">");
		
		$("#options").empty();
		var token = tokens[nextQuestion];
		var options = token.split("$");
		for (var i = 0; i < options.length; i++) {
			var option = options[i];
			$("#options").append("<input type=\"radio\" name=\"answers\" value=\"" + (i + 1) + "\"> " + option + " <br/>");
		}
	}
}