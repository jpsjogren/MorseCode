package Program;

import java.util.Scanner;

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
		String wrong = "error";
		char[] ch = new char[textToVerify.length()];
		for (int i = 0; i < textToVerify.length(); i++) { 
            ch[i] = textToVerify.charAt(i); 
        } 
		//Kolla så String inte är tom
		if (textToVerify.isEmpty()) {
			
			return "error";
		}
		
		//Kolla så att det bara är tecken som kan översättas
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (ch[i] == letters[j]) {
					wrong = morseLetters[j];
					break;
				}
			}
			if (wrong.equals("error")) {
				return "error";
			}
		}
		return textToVerify;
	}
	
}
