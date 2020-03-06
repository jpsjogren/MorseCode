package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInput {

	@Test
	void testTextToCodeVerificationUnder500() {
		String oneWord = "1234567890"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 50; i++) {
			textString = oneWord;
		}
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertNotEquals(textString, "error!");
		
	}
	@Test
	void testTextToCodeVerification() {
		String textString = "sos"; //46 chars long times 20 words = 920 chars.
		
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertNotEquals(textString, "...---...");
		
	}
	void testTextToCodeVerificationOver500() {
		String oneWord = "a"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 501; i++) {
			textString = oneWord;
		}
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		
		assertEquals(textString, "error!");
		
	}
	@Test
	void testTextToCodeVerificationNotEmpty() {
		String textString = "";
		
		TakeInput takeInput = new TakeInput();
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals(returnString, "error!");
		
	}
	
	@Test
	void testTextToCodeOnlyEngLetters() {
		
		TakeInput takeInput = new TakeInput();
		String textString = "()";
		
		String returnString = takeInput.toCodeVerification(textString);
		
		assertEquals(returnString, "error!");
		
	}
	
	@Test
	void testIfCodeIsValidOneChar() {
		
		TakeInput takeInput = new TakeInput();
		String textString = "...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals(returnString, "s");
		
	}
	@Test
	void testIfCodeIsValidOneWord() {
		
		TakeInput takeInput = new TakeInput();
		String textString = "... --- ...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals(returnString, "sos");
		
	}

	
}
