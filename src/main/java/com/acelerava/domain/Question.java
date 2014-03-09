package com.acelerava.domain;

import java.util.List;

public class Question {

	private String text;

	private List<String> options;

	public Question(String text, List<String> options) {
		super();
		this.text = text;
		this.options = options;
	}

	public String getText() {
		return text;
	}

	public List<String> getOptions() {
		return options;
	}

}
