package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInput {

	
	
	@Test
	void testTextToCodeVerificationUnder940() {
		String oneWord = "p?neumonoultramicroscopicsilicovolcanoconiosis"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 20; i++) {
			textString = oneWord + " " + textString;
		}
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertTrue(textString.length() <= 940);
		
	}
	@Test
	void testTextToCodeVerificationNotEmpty() {
		String textString = "";
		
		TakeInput takeInput = new TakeInput();
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals(returnString, null);
		
	}
	@Test
	void testTextToCodeOnlyEngLetters() {
		
		TakeInput takeInput = new TakeInput();
		String testString = "åå";
		
		String returnString = takeInput.toCodeVerification(testString);
		
		assertEquals(returnString, null);
		
	}
	
	
}
