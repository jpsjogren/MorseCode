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
	
	
	
	//Ta in input från avändaren. 
	public String takeInput(String message) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(">");
		String string = scan.nextLine();
		string = string.toLowerCase();
		
		scan.close();
		return string;
	
	}
	
	//För att slplitta upp morsekoden i sina respektive bokstäver.
	public String[][] splitter(String toSplit) {
		
		  String [] words = toSplit.split("/"); 
		    int size = words.length;
		    
		    String [][] splitted = new String [size][]; 
		    int count = 0;
		    for (String line : words)
		    {
		        splitted [count] = line.split(" ");
		        ++count;
		        
		    }
		return splitted;
		
	}
	
	public String toCodeVerification(String textToTranslate) {
		String wrong = "error!";
		String morseCode = "";
		
		//Text får inte vara längre än 500 tecken.
		if (textToTranslate.length() >= 500) {
			return "error!"; 		
		}
		else if (textToTranslate.isEmpty()) {
			
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
	
		//Kolla så String inte är tom
		if (codeToVerify.isEmpty()) {
			
			return "error!";
		}
		else if (codeToVerify.length() >= 500) {
			return "error!";
		}
		
		String[][] morseLetterToTranslate = splitter(codeToVerify);
		
	    for (int word = 0; word < morseLetterToTranslate.length; word++) {
	    	for (int letter = 0; letter < morseLetterToTranslate[word].length; letter++) {
	    		for (int k = 0; k < morseLetters.length; k++) {
			    	if (morseLetterToTranslate[word][letter].equals(morseLetters[k])) {
						wrong = false;
						output += letters[k] + "";
						break;
					}
	    		}
	    	}
	    	if (!wrong && morseLetterToTranslate[word].length > 1) {
	    		output += " ";
				
			}
		}
		return output;
	}
}
