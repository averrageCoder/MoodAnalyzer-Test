package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	public String moodAnalyzer(String message) {
		try {
			if(message.contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
		
	}
	
}
