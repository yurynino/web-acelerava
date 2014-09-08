package com.acelerava.services;

import com.acelerava.provider.UserData;

public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		UserData data = new UserData();
		boolean validUsername = username != null && username.equals(data.getStudentUserName());
		boolean validPassword = password != null && password.equals(data.getStudentPassword());

		return validUsername && validPassword;
	}

}
