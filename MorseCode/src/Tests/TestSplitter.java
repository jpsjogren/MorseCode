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
		String expectedIndex = "din";
		String actualIndex = splitter.splitString(inputString);
		
		assertEquals(expectedIndex, actualIndex);
		
	}
	

}
