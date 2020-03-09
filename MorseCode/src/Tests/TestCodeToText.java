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
		
		assertEquals("s", returnString);
		
	}
	
	@Test
	void testIfCodeIsValidOneWord() {
		
		Translate takeInput = new Translate();
		String textString = "... --- ...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals( "sos ", returnString);
		
	}
	
	@Test
	void testCodeOneSentence() {
		
		Translate takeInput = new Translate();
		String textString = "... --- .../... --- ...";
		
		String returnString = takeInput.toTextVerification(textString);
		
		assertEquals( "sos sos ", returnString);
		
	}
}
