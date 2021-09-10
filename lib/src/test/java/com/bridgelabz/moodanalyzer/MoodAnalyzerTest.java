package com.bridgelabz.moodanalyzer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;

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
	
	@Test
	public void givenNull_shouldReturnCustomException() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyzerException.class);
			String mood = moodAnalyzer.moodAnalyzer(null);
		}
		catch (MoodAnalyzerException e) {
			assertEquals(e.type, MoodAnalyzerException.ExceptionType.ENTERED_NULL);
		}
		
	}
	
	@Test
	public void givenEmptyMessage_shouldReturnCustomException() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyzerException.class);
			String mood = moodAnalyzer.moodAnalyzer("");
		}
		catch (MoodAnalyzerException e) {
			assertEquals(e.type, MoodAnalyzerException.ExceptionType.ENTERED_EMPTY);
		}
		
	}

}
