package com.acelerava.provider;

import java.util.ArrayList;
import java.util.List;

import com.acelerava.domain.Question;

public class EvaluationProvider {

	public static List<Question> getEvaluationOne() {
		List<Question> questions = new ArrayList<Question>();

		Question question1 = new Question(EvaluationOne.question1, EvaluationOne.options1);
		Question question2 = new Question(EvaluationOne.question2, EvaluationOne.options2);
		Question question3 = new Question(EvaluationOne.question3, EvaluationOne.options3);
		Question question4 = new Question(EvaluationOne.question4, EvaluationOne.options4);
		Question question5 = new Question(EvaluationOne.question5, EvaluationOne.options5);
		Question question6 = new Question(EvaluationOne.question6, EvaluationOne.options6);
		Question question7 = new Question(EvaluationOne.question7, EvaluationOne.options7);
		Question question8 = new Question(EvaluationOne.question8, EvaluationOne.options8);
		Question question9 = new Question(EvaluationOne.question9, EvaluationOne.options9);
		Question question10 = new Question(EvaluationOne.question10, EvaluationOne.options10);

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
