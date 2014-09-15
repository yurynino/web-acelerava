package com.acelerava.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.acelerava.domain.Question;

public class EvaluationService {

	private XmlService xmlService;

	public EvaluationService() {
		xmlService = new XmlService();
	}

	public List<Question> findQuestions(BufferedReader buffer) throws IOException {
		List<Question> questions = new ArrayList<Question>();
		String xmlStr = xmlService.parseXmlDom(buffer, "/questions");
		String[] questionsStr = xmlStr.trim().split("\t\t\t\t\t");

		Integer number = 0;
		String sentence = "";
		for (int i = 0; i < questionsStr.length; i++) {
			if (i % 2 == 0) {
				String questionStr = questionsStr[i];
				String[] questionFields = questionStr.trim().split("\t\t");
				number = Integer.valueOf(questionFields[0]);
				sentence = questionFields[1];

			} else {
				String optionStr = questionsStr[i];
				String[] options = optionStr.trim().split("\t\t\t");

				Question question = new Question(number, sentence);
				for (String option : options) {
					question.addOption(option);
				}
				questions.add(question);
			}
		}
		return questions;
	}

	public String[] getAnswers(BufferedReader buffer, String number) {
		String xmlStr = xmlService.parseXmlDom(buffer, "/answers/answer-" + number);
		return xmlStr.trim().split(" ");
	}

}