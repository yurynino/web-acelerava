package com.acelerava.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acelerava.domain.Question;
import com.acelerava.services.EvaluationService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class EvaluationServlet extends HttpServlet {

	private static final long serialVersionUID = -4134444174493213933L;

	private EvaluationService evaluationService;

	@Override
	public void init() throws ServletException {
		evaluationService = new EvaluationService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String number = req.getParameter("number");
		URL url = getClass().getResource("evaluation-" + number + ".xml");

		InputStreamReader input = new InputStreamReader(url.openStream());
		BufferedReader buffer = new BufferedReader(input);
		List<Question> questions = evaluationService.findQuestions(buffer);

		req.setCharacterEncoding("UTF-8");
		req.setAttribute("questions", questions);
		req.getRequestDispatcher("/" + number + "/evaluation.jsp").forward(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String number = req.getParameter("number");
		URL url = getClass().getResource("answers.xml");

		InputStreamReader input = new InputStreamReader(url.openStream());
		BufferedReader buffer = new BufferedReader(input);
		String[] answers = evaluationService.getAnswers(buffer, number);

		int grade = 0;
		for (int i = 0; i < 10; i++) {
			String answer = req.getParameter("answer_" + i);
			boolean noNull = answer != null && !answer.equals("") && !answer.equals("null");
			grade += noNull && answer.equals(answers[i]) ? 1 : 0;
		}

		Entity evalData = new Entity("Evaluation", number);
		evalData.setProperty("grade", grade);

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		datastore.put(evalData);

		req.setCharacterEncoding("UTF-8");
		req.setAttribute("grade", grade);
		req.getRequestDispatcher("/report.jsp").forward(req, resp);
	}

}