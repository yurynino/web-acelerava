package com.acelerava.provider;

import java.util.List;

import com.google.common.collect.Lists;

public class EvaluationOne implements Evaluation {

	@Override
	public String getQuestion1() {
		return "&iquest;Cu&aacute;les son los nombres de los cinco continentes?";
	}

	@Override
	public String getQuestion2() {
		return "&iquest;Qu&eacute; es un mapamundi?";
	}

	@Override
	public String getQuestion3() {
		return "&iquest;Qu&eacuten fu&eacute; el primer europeo en llegar a Colombia?";
	}

	@Override
	public String getQuestion4() {
		return "&iquest;Cu&aacute;les son departamentos de Colombia?";
	}

	@Override
	public String getQuestion5() {
		return "&iquest;Cu&aacute;l de estos fue uno de los primeros virreinatos?";
	}

	@Override
	public String getQuestion6() {
		return "&iquest;Cu&aacute;ntos departamentos tiene Colombia?";
	}

	@Override
	public String getQuestion7() {
		return "&iquest;Qu&eacute; estudia la Hidrograf&iacute;a?";
	}

	@Override
	public String getQuestion8() {
		return "&iquest;Cu&aacute;l es el nombre de los oc&eacute;anos que rodean a Colombia?";
	}

	@Override
	public String getQuestion9() {
		return "&iquest;Cu&aacute;l fue la haza&ntilde;a de Kapax?";
	}

	@Override
	public String getQuestion10() {
		return "&iquest;Quienes impulsaron la idea de independencia?";
	}

	@Override
	public List<String> getOptions1() {
		String option1 = "Am&eacute;rica, Europa, Asia, Oceania y &Aacute;frica";
		String option2 = "Am&eacute;rica, Europa, Asia, Per&uacute; y Colombia";
		String option3 = "C&oacute;rdoba, Boyac&aacute;, Cundinamarca, Bogot&aacute; y Antioquia";
		String option4 = "Am&eacute;rica, Europa y Asia";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions2() {
		String option1 = "Es un mapa de los mares del mundo";
		String option2 = "Es una r&eacute;plica a escala de un edificio";
		String option3 = "Es un mapa de toda la superficie de la Tierra";
		String option4 = "Es la capa externa de la Tierra";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions3() {
		String option3_1 = "Sim&oacute;n Bolivar";
		String option3_2 = "Jos&eacute; Celestino Mutis";
		String option3_3 = "Cristobal Col&oacute;n";
		String option3_4 = "Alonso de Ojeda";
		return Lists.newArrayList(option3_1, option3_2, option3_3, option3_4);
	}

	@Override
	public List<String> getOptions4() {
		String option1 = "La Guajira, Amazonas, Quind&iacute;o, Choc&oacute;";
		String option2 = "Garagoa, Boyac&aacute;, Cesar, Antioquia";
		String option3 = "Bogot&aacute;, Cundinamarca, Santander, Norte de Santander";
		String option4 = "Putumayo, Risaralda, Sucre, Ibagu&eacute;";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions5() {
		String option1 = "Virreinato de Colombia";
		String option2 = "Virreinato de Nueva Espa&ntilde;a";
		String option3 = "Virreinato de R&iacute;o de Janeiro";
		String option4 = "Virreinato de Nueva Am&eacute;rica";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions6() {
		String option1 = "42";
		String option2 = "16";
		String option3 = "32";
		String option4 = "33";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions7() {
		String option1 = "La tierra, el aire, el agua y el fuego.";
		String option2 = "Oc&eacute;anos, r&iacute;os, lagos, lagunas, quebradas y aguas subterr&aacute;neas";
		String option3 = "Los departamentos de Colombia";
		String option4 = "La riqueza cultural de los municipios de Colombia";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions8() {
		String option1 = "Oc&eacute;ano Atl&aacute;ntico y Oc&eacute;ano Pac&iacute;fico";
		String option2 = "Mar Caribe, Oc&eacute;ano Pac&iacute;fico e Islas de San Andr&eacute;s";
		String option3 = "R&iacute;o Magdalena, R&iacute;o Atrato y R&iacute;o Vaup&eacute;s";
		String option4 = "Oc&eacute;ano &Iacute;ndico y Oc&eacute;ano Ant&aacute;rtico";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions9() {
		String option1 = "Cruzar nadando el Oc&eacute;ano Atl&aacute;ntico";
		String option2 = "Cazar la anaconda m&aacute;s grande del planeta";
		String option3 = "Cruzar nadando el R&iacute;o Magdalena";
		String option4 = "Descubrir Am&eacute;rica en 1492";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public List<String> getOptions10() {
		String option1 = "Cristobal Col&oacute;n, Napole&oacute;n Bonaparte y Sim&oacute;n Bolivar";
		String option2 = "Kapax, Camilo Torres y Jorge Eli&eacute;cer Gait&aacute;n";
		String option3 = "Camilo Torres, Antonio Nari&ntilde;o, Francisco Jos&eacute; de Caldas y Sim&oacute;n Bol&iacute;var";
		String option4 = "Uriel Guti&eacute;rrez, Antonio Nari&ntilde;o y Francisco Jos&eacute; de Caldas ";
		return Lists.newArrayList(option1, option2, option3, option4);
	}

	@Override
	public boolean isCorrect(int number, Integer answer) {
		Integer[] answers = new Integer[] { 1, 3, 4, 1, 2, 3, 2, 1, 3, 3 };
		return answers[number].equals(answer);
	}

}