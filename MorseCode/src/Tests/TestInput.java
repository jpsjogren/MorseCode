package Tests;
import Program.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class TestInput {

	@Test
	public void shouldTakeUserInput() {
	    Translate translate = new Translate();

	    String input = "text";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("text", translate.takeInput("test"));
	}
	
	@Test
	public void shouldTakeUserInputToLower() {
	    Translate translate = new Translate();

	    String input = "HEJ";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);

	    assertEquals("hej", translate.takeInput("test"));
	}

}
