package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Program.Translate;

class TestTextToCode {
	
	@Test
	void testSingleLetter() {
		
		String oneLetter = "s";
		String actual;
		String expected = "... ";
		
		Translate takeInput = new Translate();
		actual = takeInput.toCodeVerification(oneLetter);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testOneWord() {
		String oneWord = "sos"; 
		String actual;
		String expected = "... --- ... ";
		
		Translate translate = new Translate();
		actual = translate.toCodeVerification(oneWord);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testOneSentence() {
		String oneWord = "sos sos"; 
		String expected = "... --- ...    ... --- ... ";
		
		Translate translate = new Translate();
		String actual = translate.toCodeVerification(oneWord);
		
		assertEquals(expected, actual);
	}

	@Test
	void testTextToCodeVerificationUnder500() {
		String oneWord = "1234567890"; 
		String textString = "";
		for (int i = 0; i < 49; i++) {
			textString = textString + oneWord;
		}
		
		Translate translate = new Translate();
		textString = translate.toCodeVerification(textString);
		
		assertNotEquals("error!", textString);
	}
	
	@Test
	void testTextToCodeVerificationOver500() {
		String oneWord = "a"; 
		String textString = "";
		for (int i = 0; i < 501; i++) {
			textString += oneWord;
		}
		
		Translate translate = new Translate();
		textString = translate.toCodeVerification(textString);
		
		assertEquals("error!" ,textString);
	}
	
	@Test
	void testTextToCodeVerificationNotEmpty() {
		String textString = "";
		
		Translate translate = new Translate();
		String returnString = translate.toCodeVerification(textString);
		
		assertEquals("error!", returnString);
	}
	
	@Test
	void testTextToCodeOnlyEngLetters() {
		
		Translate takeInput = new Translate();
		String textString = "åäö";
		
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals("error!", returnString);
	}

}
