package Program;

public class Menu {
	
	
	
	private void showStart() {
		System.out.println("-- Welcome to the Dih-Dah-Translator --");
		System.out.println("---------------------------------------");
		System.out.println("Would you like to translate: ----------");
		System.out.println("1: Morse to text ----------------------");
		System.out.println("2: Text to morse ----------------------");
		System.out.println("3: Help -------------------------------");
		System.out.println("4: Exit -------------------------------");
		System.out.println("---------------------------------------");
		}
	
	
	private void showHelp() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our translator!");
		System.out.println("");
		System.out.println("If you want to translate Morse to Text use the following system");
		System.out.println("Between letters use space ' '");
		System.out.println("Between words use '/'");
		System.out.println("It should look somethiong like this");
		System.out.println("... --- .../... --- ...");
		System.out.println("And that translates to 'sos sos'");
		System.out.println("");
		System.out.println("To translate text to Morse just type as normal.");
		System.out.println("It's not possible to translate longer than 500 characters at a time.");

	}
}
