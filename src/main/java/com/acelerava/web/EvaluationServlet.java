package com.acelerava.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acelerava.provider.Evaluation;
import com.acelerava.provider.EvaluationOne;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class EvaluationServlet extends HttpServlet {

	private static final long serialVersionUID = -4134444174493213933L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		String evalNumber = req.getParameter("evalNumber");
		Evaluation evaluation = getEvaluation(evalNumber);

		int grade = 0;
		for (int i = 0; i < 10; i++) {
			String answer = req.getParameter("answer_" + i);
			boolean noNull = answer != null && !answer.equals("") && !answer.equals("null");
			grade += noNull && evaluation.isCorrect(i, Integer.valueOf(answer)) ? 1 : 0;
		}

		String evaluationName = req.getParameter("evaluation");
		Entity evalData = new Entity("Evaluation", evaluationName);
		evalData.setProperty("grade", grade);
		evalData.setProperty("user", user);

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		datastore.put(evalData);

		System.out.println("Evaluation: " + evaluationName);
		System.out.println("User: " + user);
		System.out.println("Grade: " + grade);

		resp.sendRedirect("/" + evaluationName + "/evaluation.jsp");
	}

	private Evaluation getEvaluation(String evalNumber) {
		switch (evalNumber) {
		case "1":
			return new EvaluationOne();
		case "2":
//			return new EvaluationTwo();
			return new EvaluationOne();
		case "3":
//			return new EvaluationThree();
			return new EvaluationOne();
		default:
			break;
		}
		return null;
	}

}