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
		
		//Text får inte vara längre än 500 tecken.
		if (textToTranslate.length() >= 500) {
			return "error!"; 		
		}
		
		//Kolla så String inte är tom
		if (textToTranslate.isEmpty()) {
			
			return "error!";
		}
		
		//Gör om String to char array för att kunna översätta bokstav för bokstav.
		char[] ch = new char[textToTranslate.length()];
		for (int i = 0; i < textToTranslate.length(); i++) { 
            ch[i] = textToTranslate.charAt(i); 
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
		
		boolean wrong = true;
		String output = "";
		String source = codeToVerify;
	
		//Kolla så String inte är tom
		if (codeToVerify.isEmpty()) {
			
			return "error!";
		}
		if (codeToVerify.length() >= 500) {
			return "error!";
		}
		 // Första .split görs vid varje ord ('/'). 
	    String [] sOuter = source.split("/"); 
	    int size = sOuter.length;
	    
	    String [][] result = new String [size][]; 
	    int count = 0;
	    for (String line : sOuter)
	    {
	        result [count] = line.split(" ");
	        ++count;
	        
	    }
	    
	    for (int word = 0; word < result.length; word++) {
	    	for (int letter = 0; letter < result[word].length; letter++) {
	    		for (int k = 0; k < morseLetters.length; k++) {
			    	if (result[word][letter].equals(morseLetters[k])) {
						wrong = false;
						output += letters[k] + "";
						break;
					}
	    		}
	    	}
	    	if (!wrong && result[word].length > 1) {
	    		output += " ";
				
			}
		}
		return output;
	}
}
