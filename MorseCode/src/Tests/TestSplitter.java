package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Program.Splitter;
import Program.Translator;

class TestSplitter {

	@Test
	void ReturnNumberOfWords() {
		Splitter splitter =  new Splitter();
		String inputString = "hej du din lilla skit";
		int expectedNumber = 5;
		int actualNumber = splitter.splitString(inputString);
		
		assertEquals(expectedNumber, actualNumber);
		
	}
	

}
