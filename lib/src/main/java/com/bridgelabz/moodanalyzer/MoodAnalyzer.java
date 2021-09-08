package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	public String moodAnalyzer(String message) {
		
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
		
	}
	
}
