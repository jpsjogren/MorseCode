package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCodeToText {

	
	
	@Test
	void testIfCodeIsValidOneChar() {
		
		Translate takeInput = new Translate();
		String textString = "...";
		
		String returnString = takeInput.codeToText(textString);
		
		assertEquals("s ", returnString);
		
	}
	
	@Test
	void testIfCodeIsValidOneWord() {
		
		Translate takeInput = new Translate();
		String textString = "... --- ...";
		
		String returnString = takeInput.codeToText(textString);
		
		assertEquals( "sos ", returnString);
		
	}
	
	@Test
	void testCodeOneSentence() {
		
		Translate takeInput = new Translate();
		String textString = "... --- .../... --- ...";
		
		String returnString = takeInput.codeToText(textString);
		
		assertEquals( "sos sos ", returnString);
		
	}
	
	@Test
	void testCodeToTextOver500() {
		String oneWord = "."; 
		String textString = "";
		for (int i = 0; i < 501; i++) {
			textString += oneWord;
		}
		
		Translate translate = new Translate();
		textString = translate.codeToText(textString);
		
		assertEquals("Error! Check that only valid Morsecode is entered" ,textString);
	}
	
	@Test
	void testCodeToTextNotEmpty() {
		String textString = "";
		
		Translate translate = new Translate();
		String returnString = translate.codeToText(textString);
		
		assertEquals("Error! Check that only valid Morsecode is entered", returnString);
	}
	
	@Test
	void testCodeToTextOnlyValidLetters() {
		
		Translate takeInput = new Translate();
		String textString = "............ ...";
		
		String returnString = takeInput.codeToText(textString);
		
		assertEquals("Error! Check that only valid Morsecode is entered", returnString);
	}
}
