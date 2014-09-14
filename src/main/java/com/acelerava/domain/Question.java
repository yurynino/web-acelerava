package com.acelerava.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private Integer number;

	private String sentence;

	private List<String> options;

	public Question(Integer number, String sentence) {
		super();
		this.number = number;
		this.sentence = sentence;
		this.options = new ArrayList<String>();
	}

	public Integer getNumber() {
		return number;
	}

	public String getSentence() {
		return sentence;
	}

	public List<String> getOptions() {
		return options;
	}

	public void addOption(String option) {
		options.add(option);
	}

	@Override
	public String toString() {
		return "Question [number=" + number + "]";
	}

}