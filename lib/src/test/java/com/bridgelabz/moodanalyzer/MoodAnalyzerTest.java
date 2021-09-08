package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		
		String mood = moodAnalyzer.moodAnalyzer("This is a happy message");
		
		Assert.assertEquals(mood, "SAD");
		
	}
}
