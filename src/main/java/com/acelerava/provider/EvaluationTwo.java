package com.acelerava.provider;

import java.util.List;

import com.google.common.collect.Lists;

public class EvaluationTwo implements Evaluation {

	@Override
	public String getQuestion1() {
		return "&iquest;En qu&eacute; a&ntilde;o aparecen las primeras ciudades?";
	}

	@Override
	public String getQuestion2() {
		return "&iquest;Cu&aacute;les son platos t&iacute;picos de Colombia?";
	}

	@Override
	public String getQuestion3() {
		return "&iquest;Cu&aacute;les tradiciones influyeron en la gastronom&iacute;a colombiana?";
	}

	@Override
	public String getQuestion4() {
		return "&iquest;En qu&eacute; pa&iacute;s se construyeron las primeras viviendas de madera con techo de paja?";
	}

	@Override
	public String getQuestion5() {
		return "&iquest;Qu&eacute; ingredientes se necesitan para preparar arequipe?";
	}

	@Override
	public String getQuestion6() {
		return "&iquest;Qui&eacute;n compus&oacute; la canci&oacute;n \"La Casa en el Aire\"?";
	}

	@Override
	public String getQuestion7() {
		return "&iquest;Quienes construyeron las primeras casas capaces de resistir a los terremotos?";
	}

	@Override
	public String getQuestion8() {
		return "&iquest;Donde se celebra la Feria de la Cultura Wayuu?";
	}

	@Override
	public String getQuestion9() {
		return "&iquest;El Moh&aacute;n es?";
	}

	@Override
	public String getQuestion10() {
		return "&iquest;En qu&eacute; mes se realiza el Carnaval de Barranquilla?";
	}

	@Override
	public List<String> getOptions1() {
		String option1 = "A&ntilde;o 2.000 a.C.";
		String option2 = "A&ntilde;o 4.000 a.C.";
		String option3 = "A&ntilde;o 0";
		String option4 = "A&ntilde;o 500";
		return Lists.newArrayList(option1, option2, option3, option4);

	}

	@Override
	public List<String> getOptions2() {
		String option1 = "La bandeja paisa, el ajiaco santafere&ntilde;o y la lechona tolimense";
		String option2 = "El pan franc&eacute;s y las hamburguesas";
		String option3 = "El joropo, el mapal&eacute; y la salsa";
		String option4 = "Las pasta, el arroz y el trigo";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions3() {
		String option1 = "La comida europea y asi&aacute;tica";
		String option2 = "La cultura americana";
		String option3 = "Las tradiciones de los abuelos";
		String option4 = "Las tradiciones de las culturas espa&ntilde;ola, mestiza y afro";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions4() {
		String option1 = "Egipto";
		String option2 = "Colombia";
		String option3 = "Alemania";
		String option4 = "Turqu&iacute;a";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions5() {
		String option1 = "Leche, az&uacute;car blanca y zanahorias";
		String option2 = "Arroz, papa y carne";
		String option3 = "Leche, az&uacute;car blanca, bicarbonato de sodio, sal y canela";
		String option4 = "Leche, az&uacute;car blanca, bicarbonato de sodio y vinagre";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions6() {
		String option1 = "Rafael Escalona";
		String option2 = "Carlos Vives";
		String option3 = "Gabriel Garc&iacute;a Marqu&eacute;z";
		String option4 = "Shakira";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions7() {
		String option1 = "Los Mayas";
		String option2 = "Los Incas";
		String option3 = "Los Afrocolombianos";
		String option4 = "Los Gitanos";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions8() {
		String option1 = "En la Sierra Nevada de Santa Marta";
		String option2 = "En la Guajira";
		String option3 = "En Bogot&aacute;";
		String option4 = "En Ibagu&eacute;";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions9() {
		String option1 = "Un mito";
		String option2 = "Una leyenda";
		String option3 = "Un cuento";
		String option4 = "Una poes&ia";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions10() {
		String option1 = "Enero";
		String option2 = "Diciembre";
		String option3 = "Marzo";
		String option4 = "Febrero";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public boolean isCorrect(int number, Integer answer) {
		Integer[] answers = new Integer[] { 2, 1, 4, 3, 3, 1, 2, 2, 2, 4 };
		return answers[number].equals(answer);
	}

}