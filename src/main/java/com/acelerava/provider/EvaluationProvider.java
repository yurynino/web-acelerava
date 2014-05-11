package com.acelerava.provider;

import java.util.ArrayList;
import java.util.List;

import com.acelerava.domain.Question;

public class EvaluationProvider {

	public static List<Question> getEvaluation(Evaluation evaluation) {
		List<Question> questions = new ArrayList<Question>();

		Question question1 = new Question(1, evaluation.getQuestion1(), evaluation.getOptions1());
		Question question2 = new Question(2, evaluation.getQuestion2(), evaluation.getOptions2());
		Question question3 = new Question(3, evaluation.getQuestion3(), evaluation.getOptions3());
		Question question4 = new Question(4, evaluation.getQuestion4(), evaluation.getOptions4());
		Question question5 = new Question(5, evaluation.getQuestion5(), evaluation.getOptions5());
		Question question6 = new Question(6, evaluation.getQuestion6(), evaluation.getOptions6());
		Question question7 = new Question(7, evaluation.getQuestion7(), evaluation.getOptions7());
		Question question8 = new Question(8, evaluation.getQuestion8(), evaluation.getOptions8());
		Question question9 = new Question(9, evaluation.getQuestion9(), evaluation.getOptions9());
		Question question10 = new Question(10, evaluation.getQuestion10(), evaluation.getOptions10());

		questions.add(question1);
		questions.add(question2);
		questions.add(question3);
		questions.add(question4);
		questions.add(question5);
		questions.add(question6);
		questions.add(question7);
		questions.add(question8);
		questions.add(question9);
		questions.add(question10);

		return questions;
	}
}
