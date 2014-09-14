package com.acelerava.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.acelerava.domain.User;

public class UserService {

	private XmlService xmlService;

	public UserService() {
		xmlService = new XmlService();
	}

	public User getUser(BufferedReader buffer, String username, String password) throws IOException {
		List<User> users = findUsers(buffer);
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	public List<User> findUsers(BufferedReader buffer) throws IOException {
		List<User> users = new ArrayList<User>();
		String elements = xmlService.parseXmlDom(buffer, "/users");
		String[] usersStr = elements.trim().split("\t\t\t\t");

		for (String userStr : usersStr) {
			String[] userFields = userStr.trim().split("\t\t");
			String username = userFields[0];
			String password = userFields[1];
			String rol = userFields[2];

			User user = new User(username, password, rol);
			users.add(user);
		}

		return users;
	}

}
