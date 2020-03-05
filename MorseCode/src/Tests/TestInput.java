package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInput {

	
	
	@Test
	void testTextToCodeVerificationUnder940() {
		String oneWord = "pneumonoultramicroscopicsilicovolcanoconiosis"; //46 chars long times 20 words = 920 chars.
		String textString = "";
		for (int i = 0; i < 20; i++) {
			textString = oneWord + " " + textString;
		}
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		assert textString.length() <= 940;
		
	}
	@Test
	void testTextToCodeVerificationNotEmpty() {
		String textString = "";
		
		TakeInput takeInput = new TakeInput();
		textString = takeInput.toCodeVerification(textString);
		
		assert textString.length() > 0;
		
	}

}
