package com.acelerava.util;

import java.io.BufferedReader;
import java.io.IOException;

public class StringUtil {

	public String readBuffer(BufferedReader in) throws IOException {
		String cadena = "";
		String line = "";
		while ((line = in.readLine()) != null) {
			cadena += line;
		}
		return cadena;
	}

	public static String formatText(String text) {

		String newText = text.replace("Africa", "&Aacute;frica");
		newText = newText.replace("Amazonia", "Amazon&iacute;a");
		newText = newText.replace("Andres", "Andr&eacute;s");
		newText = newText.replace("Antartico", "Ant&aacute;rtico");
		newText = newText.replace("Ano", "A&ntilde;o");
		newText = newText.replace("ano", "a&ntilde;o");
		newText = newText.replace("America", "Am&eacute;rica");
		newText = newText.replace("asiatica", "asi&aacute;tica");
		newText = newText.replace("azucar", "az&uacute;car");
		newText = newText.replace("Atlantico", "Atl&aacute;ntico");
		newText = newText.replace("Bogota", "Bogot&aacute;");
		newText = newText.replace("Boyaca", "Boyac&aacute;");
		newText = newText.replace("cancion", "canci&oacute;n");
		newText = newText.replace("carbon", "carb&oacute;n");
		newText = newText.replace("Choco", "Choc&oacute;");
		newText = newText.replace("Colon", "Col&oacute;n");
		newText = newText.replace("Cordoba", "C&oacute;rdoba");
		newText = newText.replace("costeno", "coste&ntilde;o");
		newText = newText.replace("Cual", "Cu&aacute;l");
		newText = newText.replace("Cuantos", "Cu&aacute;ntos");
		newText = newText.replace("cuantas", "cu&aacute;ntas");
		newText = newText.replace("Delfin", "Delf&iacute;n");
		newText = newText.replace("Espana", "Espa&ntilde;a");
		newText = newText.replace("energia", "energ&iacute;a");
		newText = newText.replace("Espana", "Espa&ntilde;a");
		newText = newText.replace("hidroelectrica", "hidroel&eacute;ctrica");
		newText = newText.replace("espanol", "espa&ntilde;ol");
		newText = newText.replace("frances", "franc&eacute;s");
		newText = newText.replace("Garcia", "Garc&iacute;a");
		newText = newText.replace("Marquez", "Marqu&eacute;z");
		newText = newText.replace("gastronomia", "gastronom&iacute;a");
		newText = newText.replace("Gutierrez", "Guti&eacute;rrez");
		newText = newText.replace("Gaitan", "Gait&aacute;n");
		newText = newText.replace("Hidrografia", "Hidrograf&iacute;a");
		newText = newText.replace("Ibague", "Ibague&eacute;");
		newText = newText.replace("Jose", "Jos&eacute;");
		newText = newText.replace("mapale", "mapal&eacute;");
		newText = newText.replace("Mohan", "Moh&aacute;n");
		newText = newText.replace("Narino", "Nari&ntilde;o");
		newText = newText.replace("Orinoquia", "Orinoqu&iacute;a");
		newText = newText.replace("Pacifico", "Pac&iacute;fico");
		newText = newText.replace("pais", "pa&iacute;s");
		newText = newText.replace("plastico", "pl&aacute;stico");
		newText = newText.replace("Peru", "Per&uacute;");
		newText = newText.replace("petroleo", "petr&oacute;leo");
		newText = newText.replace("poesia", "poes&iacute;a");
		newText = newText.replace("Que", "Qu&eacute;");
		newText = newText.replace("que", "qu&eacute;");
		newText = newText.replace("Quindio", "Quind&iacute;o");
		newText = newText.replace("Quien", "Quid&eacute;n");
		newText = newText.replace("Oceano", "Oc&eacute;ano");
		newText = newText.replace("oceano", "oc&eacute;ano");
		newText = newText.replace("replica", "r&eacute;plica");
		newText = newText.replace("Region", "Regi&oacute;n");
		newText = newText.replace("region", "regi&oacute;n");
		newText = newText.replace("Rio", "R&iacute;o");
		newText = newText.replace("rio", "r&iacute;o");
		newText = newText.replace("santafereno", "santafere&ntilde;o");
		newText = newText.replace("Simon", "Sim&oacute;n");
		newText = newText.replace("subterraneas", "subterr&aacute;neas");
		newText = newText.replace("típicos", "típicos");
		newText = newText.replace("Vaupes", "Vaup&eacute;s");

		return newText;
	}
}
