package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Menu;

import org.junit.jupiter.api.Test;

class TestMenyChoice {

	@Test
	void testValidInput() {
		Menu menu = new Menu();
		String choice = "1";
		
		menu.choose(choice);
		
	}

}
