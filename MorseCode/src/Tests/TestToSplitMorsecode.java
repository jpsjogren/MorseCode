package Tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Program.Translate;

class TestToSplitMorsecode {
	
	
	@Test
	void testOneLetter() {
		
		
		Translate takeInput = new Translate();
		String textString = "...";
		
		String[][] expected = {{"..."}};
		
		String[][] returnString = takeInput.splitter(textString);
		
		assertArrayEquals(expected, returnString);
		
	}
	
	@Test
	void testoneWord() {
		
		
		Translate takeInput = new Translate();
		String textString = "... --- ...";
		
		String[][] expected = {{"...","---","..."}};
		
		String[][] returnString = takeInput.splitter(textString);
		
		assertArrayEquals(expected, returnString);
	}

	@Test
	void testMultiWords() {
		
		
		Translate takeInput = new Translate();
		String textString = "... --- .../... --- ...";
		
		String[][] expected = {{"...","---","..."}, {"...","---","..."}};
		
		String[][] returnString = takeInput.splitter(textString);
		
		assertArrayEquals(expected, returnString);
	}

}
