package com.acelerava.provider;

import java.util.List;

import com.google.common.collect.Lists;

public class EvaluationThree implements Evaluation {

	@Override
	public String getQuestion1() {
		return "&iquest;Cu&aacute;les son las regiones naturales de Colombia?";
	}

	@Override
	public String getQuestion2() {
		return "&iquest;Con cu&aacute;ntas lenguas nativas cuenta Colombia?";
	}

	@Override
	public String getQuestion3() {
		return "&iquest;Cu&aacute;l regi&oacute;n comprende el 41% del territorio nacional?";
	}

	@Override
	public String getQuestion4() {
		return "&iquest;Cu&aacute;l es la regi&oacute;n m&aacute;s grande y poblada de Colombia?";
	}

	@Override
	public String getQuestion5() {
		return "&iquest;Con cu&aacute;ntos pueblos ind&iacute;genas cuenta Colombia?";
	}

	@Override
	public String getQuestion6() {
		return "&iquest;Cu&aacute;les son los tipos de recursos naturales?";
	}

	@Override
	public String getQuestion7() {
		return "&iquest;En qu&eacute; sitio pas&oacute; la Leyenda del Dorado?";
	}

	@Override
	public String getQuestion8() {
		return "&iquest;Cu&aacute;les son ejemplos de recursos renovables?";
	}

	@Override
	public String getQuestion9() {
		return "&iquest;En donde se desarrolla la leyenda del Delf&iacute;n Rosado?";
	}

	@Override
	public String getQuestion10() {
		return "&iquest;Qu&eacute; es el Mequerule?";
	}

	@Override
	public List<String> getOptions1() {
		String option1 = "Oc&eacute;ano Pac&iacute;fico, Oc&eacute;ano Atl&aacute;ntico";
		String option2 = "Cundinamarca, Boyac&aacute;, Risaralda";
		String option3 = "Regi&oacute;n Caribe, Regi&oacute;n de la Orinoqu&iacute;a, Regi&oacute;n Andina, Regi&oacute;n Pacif&iacute;ca, Regi&oacute;n de la Amazon&iacute;a";
		String option4 = "Regi&oacute;n Caribe, Regi&oacute;n de la Orinoqu&iacute;a, Regi&oacute;n Andina, Regi&oacute;n Pacif&iacute;ca, Regi&oacute;n de la Amazon&iacute;a, Regi&oacute;n Insular";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions2() {
		String option1 = "12";
		String option2 = "64";
		String option3 = "46";
		String option4 = "63";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions3() {
		String option1 = "Regi&oacute;n Amazon&iacute;a";
		String option2 = "Regi&oacute;n Caribe";
		String option3 = "Regi&oacute;n Latina";
		String option4 = "R&iacute;o Magdalena";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions4() {
		String option1 = "Cundinamarca";
		String option2 = "Regi&oacute;n Amazon&iacute;a";
		String option3 = "Regi&oacute;n Pacifico";
		String option4 = "Regi&oacute;n Andina";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions5() {
		String option1 = "14";
		String option2 = "30";
		String option3 = "64";
		String option4 = "87";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions6() {
		String option1 = "Flora y fauna";
		String option2 = "Renovables y no renovables";
		String option3 = "Degradables y biodegradables";
		String option4 = "Renovables y minerales";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions7() {
		String option1 = "Laguna de Tota";
		String option2 = "Laguna de Risaralda";
		String option3 = "Laguna de Guatavita";
		String option4 = "R&iacute;o Magdalena";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions8() {
		String option1 = "El petr&oacute;leo, las esmeraldas y el carb&oacute;n";
		String option2 = "La radiaci&oacute;n solar, las mareas, el viento y la energ&iacute;a hidroel&eacute;ctrica";
		String option3 = "El pl&aacute;stico, el carb&oacute;n y los animales";
		String option4 = "El viento, el agua y el oro";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions9() {
		String option1 = "R&iacute;o Caribe";
		String option2 = "Laguna de Tota";
		String option3 = "R&iacute;o Amazonas";
		String option4 = "Laguna de Guatavita";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions10() {
		String option1 = "Un ritmo de salsa";
		String option2 = "Un baile de mapal&eacute;";
		String option3 = "Un ritmo costeño";
		String option4 = "Un ritmo negro chocoano";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public boolean isCorrect(int number, Integer answer) {
		Integer[] answers = new Integer[] { 4, 2, 1, 4, 4, 2, 3, 2, 3, 4 };
		return answers[number].equals(answer);
	}
	
}