package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Program.Translator;

class TestTranslator {
	@Test
	void ShouldReturnTrue_IfCorrectTranslate() {
		
		Translator translator = new Translator();
		
		String output1 = translator.charToMorse('o');
		String expectedOutput1 = "---";

		assertEquals(output1, expectedOutput1);
		
		String output2 = translator.charToMorse('g');
		String expectedOutput2 = "--.";

		assertEquals(output2, expectedOutput2);
		
		String output3 = translator.charToMorse('?');
		String expectedOutput3 = "..--..";

		assertEquals(output3, expectedOutput3);
	}

}
