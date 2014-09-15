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
		String newText = text.replace("á", "&aacute;").replace("Á", "&Aacute");
		newText = newText.replace("é", "&eacute;").replace("É", "&Eacute");
		newText = newText.replace("í", "&iacute;").replace("Í", "&Iacute");
		newText = newText.replace("ó", "&oacute;").replace("Ó", "&Oacute");
		newText = newText.replace("ú", "&uacute;").replace("Ú", "&Uacute");
		newText = newText.replace("ñ", "&ntilde;").replace("Ñ", "&Ntilde");
		return newText;
	}
}
