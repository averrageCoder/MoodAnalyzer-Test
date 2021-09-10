package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
	
	private String message;

	public String moodAnalyzer(String message) throws MoodAnalyzerException {
		this.message = message;
		return moodAnalyzer();
		
	}

	public String moodAnalyzer() throws MoodAnalyzerException{
		try {
			if(message.length()==0) {
				throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,"Please enter a proper message!");
			}
			if(message.contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException e) {
			throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,"Please enter a proper message!");
		}
	}
}
