package Program;

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
	
	
	public String toCodeVerification(String textStringToVerify) {
		// TODO Auto-generated method stub
		
		if (textStringToVerify == "") {
			return null;
		}
		else {
			for (int i = 0; i < letters.length; i++) {
				if (textStringToVerify.indexOf(letters[i]) < 0) {
					return null;
				}
			}
		}
		
		return textStringToVerify;
	}
	
	

}
