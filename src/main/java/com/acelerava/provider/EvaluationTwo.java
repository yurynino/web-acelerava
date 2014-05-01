package com.acelerava.provider;

import java.util.List;

import com.google.common.collect.Lists;

public class EvaluationTwo {

	public static String question1 = "&iquest;Cu&aacute;les son los nombres de los cinco continentes?";
	private static String option1_1 = "Am&eacute;rica, Europa, Asia, Oceania, &Aacute;frica";
	private static String option1_2 = "Am&eacute;rica, Europa, Asia, Per&uacute;, Colombia";
	private static String option1_3 = "C&oacute;rdoba, Boyac&aacute;, Cundinamarca, Bogot&aacute;, Antioquia";
	private static String option1_4 = "Am&eacute;rica, Europa, Asia,";
	public static List<String> options1 = Lists.newArrayList(option1_1, option1_2, option1_3, option1_4);

	public static String question2 = "&iquest;Qu&eacute; es un mapamundi?";
	public static String option2_1 = "Es un mapa de los mares del mundo";
	public static String option2_2 = "Es una r&eacute;plica a escala de un edificio";
	public static String option2_3 = "Es un mapa de toda la superficie de la Tierra";
	public static String option2_4 = "Es la capa externa de la Tierra";
	public static List<String> options2 = Lists.newArrayList(option2_1, option2_2, option2_3, option2_4);

	public static String question3 = "&iquest;Qu&eacuten fu&eacute; el primer europeo en llegar a Colombia?";
	private static String option3_1 = "Sim&oacute;n Bolivar";
	private static String option3_2 = "Jos&eacute; Celestino Mutis";
	private static String option3_3 = "Cristobal Col&oacute;n";
	private static String option3_4 = "Alonso de Ojeda";
	public static List<String> options3 = Lists.newArrayList(option3_1, option3_2, option3_3, option3_4);

	public static String question4 = "&iquest;Cu&aacute;les son departamentos de Colombia?";
	private static String option4_1 = "La Guajira, Amazonas, Quind&iacute;o, Choc&oacute;";
	private static String option4_2 = "Garagoa, Boyac&aacute;, Cesar, Antioquia";
	private static String option4_3 = "Bogot&aacute;, Cundinamarca, Santander, Norte de Santander";
	private static String option4_4 = "Putumayo, Risaralda, Sucre, Ibagu&eacute;";
	public static List<String> options4 = Lists.newArrayList(option4_1, option4_2, option4_3, option4_4);

	public static String question5 = "&iquest;Cu&aacute;l de estos fue uno de los primeros virreinatos?";
	private static String option5_1 = "Virreinato de Colombia";
	private static String option5_2 = "Virreinato de Nueva Espa&ntilde;a";
	private static String option5_3 = "Virreinato de R&iacute;o de Janeiro";
	private static String option5_4 = "Virreinato de Nueva Am&eacute;rica";
	public static List<String> options5 = Lists.newArrayList(option5_1, option5_2, option5_3, option5_4);

	public static String question6 = "&iquest;Cu&aacute;ntos departamentos tiene Colombia?";
	private static String option6_1 = "42";
	private static String option6_2 = "16";
	private static String option6_3 = "32";
	private static String option6_4 = "33";
	public static List<String> options6 = Lists.newArrayList(option6_1, option6_2, option6_3, option6_4);

	public static String question7 = "&iquest;Cu&aacute;les son las regiones naturales de Colombia?";
	private static String option7_1 = "Regi&oacute;n Central, Regi&oacute;n Oriental, Regi&oacute;n Occidental";
	private static String option7_2 = "Regi&oacute;n Andina, Regi&oacute;n Amazon&iacute;a, Regi&oacute;n del Pac&iacute;fico, Regi&oacute;n Caribe, Regi&oacute;n Orinoqu&iacute;a";
	private static String option7_3 = "Regi&oacute;n Norte, Regi&oacute;n Sur, Regi&oacute;n Valle";
	private static String option7_4 = "Regi&oacute;n Andina, Regi&oacute;n Amazon&iacute;a, Regi&oacute;n del Pac&iacute;fico, Regi&oacute;n Atl&aacute;ntico";
	public static List<String> options7 = Lists.newArrayList(option7_1, option7_2, option7_3, option7_4);

	public static String question8 = "&iquest;Cual es la regi&oacute;n con la menor densidad de poblaci&oacute;n?";
	private static String option8_1 = "Regi&oacute;n Amazon&iacute;a";
	private static String option8_2 = "Regi&oacute;n Central";
	private static String option8_3 = "Regi&oacute;n Caribe";
	private static String option8_4 = "Regi&oacute;n Andina";
	public static List<String> options8 = Lists.newArrayList(option8_1, option8_2, option8_3, option8_4);

	public static String question9 = "";
	private static String option9_1 = "";
	private static String option9_2 = "";
	private static String option9_3 = "";
	private static String option9_4 = "";
	public static List<String> options9 = Lists.newArrayList(option9_1, option9_2, option9_3, option9_4);

	public static String question10 = "";
	private static String option10_1 = "";
	private static String option10_2 = "";
	private static String option10_3 = "";
	private static String option10_4 = "";
	public static List<String> options10 = Lists.newArrayList(option10_1, option10_2, option10_3, option10_4);
	
	private static Integer[] answers = new Integer[]{1, 3, 4, 1, 2, 3, 2, 1, 1, 1};

	public static boolean isCorrect(int number, Integer answer) {
		return answers[number].equals(answer);
	}

	
}