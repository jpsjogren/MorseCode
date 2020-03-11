package Program;

import java.util.Scanner;

public class Menu {
	
	
	
	public static void showStart() throws InterruptedException {
		System.out.println("-- Welcome to the Dih-Dah-Translator --");
		System.out.println("---------------------------------------");
		System.out.println("Would you like to translate: ----------");
		System.out.println("1: Morse to text ----------------------");
		System.out.println("2: Text to morse ----------------------");
		System.out.println("3: Help -------------------------------");
		System.out.println("4: Exit -------------------------------");
		System.out.println("---------------------------------------");
		menuControl();
		}
	public static void menuControl() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press the digit corresponding to your choice, then press enter");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			initializeMorseToText();
			Thread.sleep(3000);
			showStart();
			break;
		
		case 2: 
			initializeTextToMorse();
			Thread.sleep(3000);
			showStart();
			break;
		case 3:
			showHelp();
			Thread.sleep(3000);
			showStart();
			break;
		case 4:
			Shutdown();
			break;
		default:
			System.out.println("Invalid, try again.");
			showStart();
		}
	}
	public static void Shutdown() throws InterruptedException {
		System.out.print("Shutting down...");
		Thread.sleep(2000);
		System.exit(0);
	}
	public static void initializeMorseToText() {
		Scanner scanner = new Scanner(System.in);
		Translate userTranslate = new Translate();
		
		System.out.println("Enter the morse code you want to translate: ");
		String userInputMorse = scanner.nextLine();
		String outputText = userTranslate.codeToText(userInputMorse);
		System.out.println("Result: \n" + outputText);
	}
	public static void initializeTextToMorse() {
		Scanner scanner = new Scanner(System.in);
		Translate userTranslate = new Translate();
		
		System.out.println("Enter the text you want to translate: ");
		String userInputText = scanner.nextLine();
		String outputMorse = userTranslate.textToCode(userInputText);
		System.out.println("Result: \n" + outputMorse);
	}
	public static void showHelp() {
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
