package Program;

public class Translate {

	char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
			'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','.',',','?'};
	
	String[] morseLetters = {"  ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
			 "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
			 "...-", ".--", "-..-", "-.--", "--..",	".----", "..---", "...--", "....-",
			 ".....", "-....", "--...", "---..", "----.", "-----",".-.-.-","--..--","..--.."};
	
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
	
	private char[] makeCharArray(String textToTranslate) {
		
		char[] ch = new char[textToTranslate.length()];
		for (int i = 0; i < textToTranslate.length(); i++) { 
            ch[i] = textToTranslate.charAt(i); 
        }
		
		return ch;
	}
	
	private String checkLength(String toTest) {
		
		if (toTest.length() >= 500) {
			return "error!"; }
		else if (toTest.isEmpty()) {
			return "error!"; }
		return toTest;		
	}

	public String textToCode(String textToTranslate) {
		String morseCode = "";
		int countChars = 0;
		
		textToTranslate = checkLength(textToTranslate);
		
		char[] toTranslate = makeCharArray(textToTranslate);
		
		//Kolla så att det bara är tecken som kan översättas
		for (int i = 0; i < toTranslate.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (toTranslate[i] == letters[j]) {
					morseCode += morseLetters[j] + " ";
					countChars++;
					break;
				}
			}
		}
		if ( countChars < textToTranslate.length() || textToTranslate.equals("error!")) {
				return "Error! Check that you only entered english letters.";
				
		}
		return morseCode;
	}

	public String codeToText(String codeToTranslate) {
		int countChar = 0;
		String output = "";
		boolean wrong = true;
	
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
	    		}
	    		if (wrong) {
					return "Error! Check that only valid Morsecode is entered";
				}
	    	}
	    	if (!wrong) {
	    		output += " ";
			}
		}
		    if (codeToTranslate.equals("error!")) {
				return "Error! Check that only valid Morsecode is entered";
			}
	    
		return output;
	}
}