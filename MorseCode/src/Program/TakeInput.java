package Program;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class TakeInput {

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
	
	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Skriv in nåt då!");
		String string = scan.nextLine();
		string = string.toLowerCase();
		System.out.println(string);
		scan.close();
	
	}
	
	
	
	public String toCodeVerification(String textToVerify) {
		
		int wrong = 0;
		if (textToVerify.isEmpty()) {
			
			return null;
		}
		
		
		return textToVerify;
	}
}
