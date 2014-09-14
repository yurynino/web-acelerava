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
}
