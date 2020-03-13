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
	
	//Gör om String till char array för att lättare jämföra och översätta
	private char[] makeCharArray(String textToTranslate) {
		
		char[] ch = new char[textToTranslate.length()];
		for (int i = 0; i < textToTranslate.length(); i++) { 
            ch[i] = textToTranslate.charAt(i); 
        }
		
		return ch;
	}
	
	//Ser till så att man inte matar in tom text eller för lång
	private String checkLength(String toTest) {
		
		if (toTest.length() >= 500) {
			return "error!"; }
		else if (toTest.isEmpty()) {
			return "error!"; }
		return toTest;		
	}

	//Översätter texten till morsekod om det är möjligt.
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

	//Översätter morsekod till text om det är möjligt
	public String codeToText(String codeToTranslate) {
		String output = "";
		boolean wrong = true;
	
		codeToTranslate = checkLength(codeToTranslate);
		
		String[][] morseLetterToTranslate = splitter(codeToTranslate);
		
	    for (int word = 0; word < morseLetterToTranslate.length; word++) {					//Går igenom ord för ord
	    	for (int letter = 0; letter < morseLetterToTranslate[word].length; letter++) {	//Går i genom "bokstäverna"		
	    		for (int k = 0; k < morseLetters.length; k++) {								//Går igenommorsealfabetet
			    	if (morseLetterToTranslate[word][letter].equals(morseLetters[k])) {		//Jämför morsealfabetet med inmatad bokstav
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