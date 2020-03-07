package Program;

import java.util.Scanner;

public class Translate {

	char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
			'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','.',',','?'};
	
	String[] morseLetters = {"  ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			 "....", "..", ".---", "-.-", ".-..", "--", "-.",
			 "---", ".--.", "--.-", ".-.", "...", "-", "..-",
			 "...-", ".--", "-..-", "-.--", "--..",
			 ".----", "..---", "...--", "....-",
			 ".....", "-....", "--...", "---..", "----.",
			 "-----",".-.-.-","--..--","..--.."};
	
	public String takeInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv in nåt då!");
		System.out.println(">");
		String string = scan.nextLine();
		string = string.toLowerCase();
		System.out.println(string);
		scan.close();
		return string;
	
	}
	
	
	
	public String toCodeVerification(String textToTranslate) {
		String wrong = "error!";
		String morseCode = "";
		//textToTranslate = "åä";
		//Text får inte vara längre än 500 tecken.
		if (textToTranslate.length() >= 500) {
			return "error!"; 		
		}
		char[] ch = new char[textToTranslate.length()];
		for (int i = 0; i < textToTranslate.length(); i++) { 
            ch[i] = textToTranslate.charAt(i); 
        } 
		//Kolla så String inte är tom
		if (textToTranslate.isEmpty()) {
			
			return "error!";
		}
		
		//Kolla så att det bara är tecken som kan översättas
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (ch[i] == letters[j]) {
					wrong = morseLetters[j];
					morseCode += morseLetters[j] + " ";
					break;
				}
			}
			if (wrong.equals("error!")) {
				return "error!";
			}
		}
		System.out.println(morseCode);
		return morseCode;
	}
	
	public String toTextVerification(String codeToVerify) {
		String wrong = "error!";
		String output = "";
		String[] stringSplit = codeToVerify.split(" ");
		
		
	
		//Kolla så String inte är tom
		if (codeToVerify.isEmpty()) {
			
			return "error!";
		}
		if (codeToVerify.length() >= 500) {
			return "error!"; 		
		}
		
		//Kolla så att det bara är tecken som kan översättas
		for (int i = 0; i < stringSplit.length; i++) {
			for (int j = 0; j < morseLetters.length; j++) {
				if (stringSplit[i].equals(morseLetters[j])) {
					wrong = letters[j] + "";
					output += letters[j] + "";
				}
			}
		}
		if (wrong.equals("error!")) {
			return "error!";
		}
		return output;
	}
}
