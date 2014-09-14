package com.acelerava.services;

import java.io.BufferedReader;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.acelerava.util.StringUtil;

public class XmlService {

	private StringUtil stringUtil;

	public XmlService() {
		stringUtil = new StringUtil();
	}

	public String parseXmlDom(BufferedReader buffer, String expression) {
		try {
			String cadena = stringUtil.readBuffer(buffer);
			InputSource source = new InputSource(new StringReader(cadena));

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(source);

			XPathFactory xpathFactory = XPathFactory.newInstance();
			XPath xpath = xpathFactory.newXPath();

			buffer.close();

			return xpath.evaluate(expression, document);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}