package com.acelerava.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acelerava.domain.User;
import com.acelerava.services.UserService;

public class SignServlet extends HttpServlet {

	private static final long serialVersionUID = -4134444174493213933L;

	private UserService userService;

	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("login.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String username = req.getParameter("username");
			String password = req.getParameter("password");

			URL url = getClass().getResource("users.xml");
			InputStreamReader input = new InputStreamReader(url.openStream());
			BufferedReader buffer = new BufferedReader(input);

			req.setCharacterEncoding("UTF-8");
			User user = userService.getUser(buffer, username, password);
			if (user != null) {
				req.getSession().setAttribute("user", user);
				resp.sendRedirect("index.jsp");
			} else {
				req.setAttribute("error", "No se encontró un usuario con las credenciales ingresadas");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", "No se encontró un usuario con las credenciales ingresadas");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}