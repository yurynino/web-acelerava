package com.acelerava.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acelerava.domain.User;
import com.acelerava.services.AuthenticationService;

public class SignServlet extends HttpServlet {

	private static final long serialVersionUID = -4134444174493213933L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("login.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		AuthenticationService service = new AuthenticationService();

		if (service.authenticate(username, password)) {
			User user = new User();
			req.setAttribute("user", user);
			resp.sendRedirect("index.jsp");
		} else {
			resp.sendRedirect("login.jsp");
		}
	}

}