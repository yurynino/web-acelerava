package com.acelerava.domain;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 698238458848474917L;

	private String username;

	private String password;

	private String rol;

	public User(String username, String password, String rol) {
		super();
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRol() {
		return rol;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", rol=" + rol + "]";
	}

}