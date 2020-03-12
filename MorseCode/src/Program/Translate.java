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
	
	public String checkLength(String toTest) {
		
		if (toTest.length() >= 500) {
			return "error!"; }
		else if (toTest.isEmpty()) {
			return "error!"; }
		return toTest;		
	}

	
	public String textToCode(String textToTranslate) {
		boolean wrong = true;
		String morseCode = "";
		
		textToTranslate = checkLength(textToTranslate);
		
		char[] toTranslate = makeCharArray(textToTranslate);
		
		//Kolla så att det bara är tecken som kan översättas
		for (int i = 0; i < toTranslate.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (toTranslate[i] == letters[j]) {
					wrong = false;
					morseCode += morseLetters[j] + " ";
					break;
				}
				else {
		    		wrong = true;
		    	}
			}
		}
		if ( wrong || textToTranslate.equals("error!") || morseCode.equals("error!")) {
				return "Error! Check that you only entered english letters.";
				
		}
		return morseCode;
	}
	
	private char[] makeCharArray(String textToTranslate) {
		
		char[] ch = new char[textToTranslate.length()];
		for (int i = 0; i < textToTranslate.length(); i++) { 
            ch[i] = textToTranslate.charAt(i); 
        }
		
		return ch;
	}

	public String codeToText(String codeToTranslate) {
		//codeToTranslate = "";
		
		boolean wrong = true;
		String output = "";
	
		codeToTranslate = checkLength(codeToTranslate);
		
		String[][] morseLetterToTranslate = splitter(codeToTranslate);
		
	    for (int word = 0; word < morseLetterToTranslate.length; word++) {
	    	for (int letter = 0; letter < morseLetterToTranslate[word].length; letter++) {
	    		for (int k = 0; k < morseLetters.length; k++) {
			    	if (morseLetterToTranslate[word][letter].equals(morseLetters[k])) {
						wrong = false;
						output += letters[k] + "";
						break;
					}
			    	else {
			    		wrong = true;
			    	}
	    		}
	    	}
	    	if (!wrong && morseLetterToTranslate[word].length > 1) {
	    		output += " ";
			}
		}
	    if ( wrong || codeToTranslate.equals("error!") || output.equals("error!")) {
			return "Error! Check that only valid Morsecode is entered";
			
		}
		return output;
	}
}
