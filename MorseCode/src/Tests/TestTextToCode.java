package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Program.Translate;

class TestTextToCode {
	
	@Test
	void testSingleLetter() {
		
		String oneLetter = "s"; //46 chars long times 20 words = 920 chars.
		String actual;
		String expected = "... ";
		
		Translate takeInput = new Translate();
		actual = takeInput.toCodeVerification(oneLetter);
		
		assertEquals(actual, expected);
		
	}
	
	@Test
	void testOneWord() {
		String oneWord = "sos"; //46 chars long times 20 words = 920 chars.
		String actual;
		String expected = "... --- ... ";
		
		Translate takeInput = new Translate();
		actual = takeInput.toCodeVerification(oneWord);
		
		assertEquals(actual, expected);
		
	}
	
	@Test
	void testOneSentence() {
		String oneWord = "sos sos"; //46 chars long times 20 words = 920 chars.
		String actual;
		String expected = "... --- ...    ... --- ... ";
		
		Translate takeInput = new Translate();
		actual = takeInput.toCodeVerification(oneWord);
		
		assertEquals(actual, expected);
		
	}


	@Test
	void testTextToCodeVerificationUnder500() {
		String oneWord = "1234567890"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 50; i++) {
			textString = oneWord;
		}
		
		Translate takeInput = new Translate();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertNotEquals(textString, "error!");
		
	}
	@Test
	void testTextToCodeVerification() {
		String textString = "sos"; //46 chars long times 20 words = 920 chars.
		
		
		Translate takeInput = new Translate();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertNotEquals(textString, "...---...");
		
	}
	void testTextToCodeVerificationOver500() {
		String oneWord = "a"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 501; i++) {
			textString = oneWord;
		}
		
		Translate takeInput = new Translate();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertEquals(textString, "error!");
		
	}
	@Test
	void testTextToCodeVerificationNotEmpty() {
		String textString = "";
		
		Translate takeInput = new Translate();
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals(returnString, "error!");
		
	}
	
	@Test
	void testTextToCodeOnlyEngLetters() {
		
		Translate takeInput = new Translate();
		String textString = "";
		
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals(returnString, "error!");
		
	}

}
