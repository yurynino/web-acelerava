package com.acelerava.domain;

import java.util.ArrayList;
import java.util.List;

import com.acelerava.util.StringUtil;

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

	public String getFormatSentence() {
		String formatText = StringUtil.formatText(sentence);
		formatText = "&iquest;" + formatText + "?";
		return formatText;
	}

	public List<String> getOptions() {
		return options;
	}

	public List<String> getFormatOptions() {
		List<String> formatOptions = new ArrayList<String>();
		for (String option : options) {
			String newOption = StringUtil.formatText(option);
			formatOptions.add(newOption);
		}
		return formatOptions;
	}

	public void addOption(String option) {
		options.add(option);
	}

	@Override
	public String toString() {
		return "Question [number=" + number + "]";
	}

}