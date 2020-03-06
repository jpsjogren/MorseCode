package Program;

import java.util.Scanner;

public class Translator {
	
	char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
			'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','.',',','?'};
	
	String[] morseLetters = {"   ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			 "....", "..", ".---", "-.-", ".-..", "--", "-.",
			 "---", ".--.", "--.-", ".-.", "...", "-", "..-",
			 "...-", ".--", "-..-", "-.--", "--..",
			 ".----", "..---", "...--", "....-",
			 ".....", "-....", "--...", "---..", "----.",
			 "-----",".-.-.-","--..--","..--.."};
	
	
	public String charToMorse(char testInput) {
		
		for (int i = 0; i < letters.length; i++) {
			if (testInput == letters[i]) {
				return morseLetters[i];
			}
		}
		return null;
	}
	
	public String morseToEng() {
			
		
		//
		boolean update = true;
		Scanner input = new Scanner(System.in);
		String toEng = "";
		
	
		System.out.println("Write one sequence in morse at a time, press enter after each letter/digit.");
		System.out.println("Enter 4 blank spaces and press enter after each word, to finish enter '0' and press enter.\n");
		
		
		
		while (update) {
			String tempInput = input.nextLine();
			
			if (tempInput.equals("quit")) {
				update = false;
				System.out.println(toEng);
			}
			else {
				for (int i = 0; i < morseLetters.length; i++) {
					if (tempInput.equals(morseLetters[i])) {
						toEng += letters[i];
						System.out.println(toEng);
					}
				}
			}
			
		}
		return null;
	}
}
