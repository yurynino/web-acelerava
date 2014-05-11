package com.acelerava.provider;

import java.util.List;

public interface Evaluation {

	public String getQuestion1();

	public String getQuestion2();

	public String getQuestion3();

	public String getQuestion4();

	public String getQuestion5();

	public String getQuestion6();

	public String getQuestion7();

	public String getQuestion8();

	public String getQuestion9();

	public String getQuestion10();

	public List<String> getOptions1();

	public List<String> getOptions2();

	public List<String> getOptions3();

	public List<String> getOptions4();

	public List<String> getOptions5();

	public List<String> getOptions6();

	public List<String> getOptions7();

	public List<String> getOptions8();

	public List<String> getOptions9();

	public List<String> getOptions10();
	
	public boolean isCorrect(int number, Integer answer);

}