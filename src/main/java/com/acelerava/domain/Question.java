package com.acelerava.domain;

import java.util.List;

public class Question {
	
	private Integer number;

	private String text;

	private List<String> options;

	public Question(Integer number, String text, List<String> options) {
		super();
		this.number = number;
		this.text = text;
		this.options = options;
	}
	
	public Integer getNumber() {
		return number;
	}

	public String getText() {
		return text;
	}

	public List<String> getOptions() {
		return options;
	}

}
