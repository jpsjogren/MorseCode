package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCodeToText {

	
	
	@Test
	void testIfCodeIsValidOneChar() {
		
		Translate takeInput = new Translate();
		String textString = "...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals(returnString, "s");
		
	}
	@Test
	void testIfCodeIsValidOneWord() {
		
		Translate takeInput = new Translate();
		String textString = "... --- ...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals(returnString, "sos");
		
	}

	
}
