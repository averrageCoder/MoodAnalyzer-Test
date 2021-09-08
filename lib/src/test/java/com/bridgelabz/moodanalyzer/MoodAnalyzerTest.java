package com.bridgelabz.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

	@Test
	public void givenSadMessage_shouldReturnSad() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		
		String mood = moodAnalyzer.moodAnalyzer("This is a sad message");
		
		assertEquals(mood, "SAD");
		
	}
	
	@Test
	public void givenHappyMessage_shouldReturnHappy() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		
		String mood = moodAnalyzer.moodAnalyzer("This is a happy message");
		
		assertEquals(mood, "HAPPY");
		
	}

}
