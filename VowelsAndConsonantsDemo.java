import java.util.Scanner;		// Needed for Scanner Class

/**
	Alexander Waters 
	I.D: 23598844
	Chapter 9 #04
	Vowels and consonants Demo
*/

public class VowelsAndConsonantsDemo
{
	// Create static Scanner object for keyboard input.
	static Scanner keyboard = new Scanner(System.in);
	// Static VowelsAndConsonants object to use through program.
	static VowelsAndConsonants vc = new VowelsAndConsonants();

	public static void main(String[] args)
	{
		String line;		// Holds user input
		char m = 'd';		// Flag variable

		// While character is alphabetical
		// run loop.
		while(m >= 'a' && m <= 'z')
		{
			// Menu and methods used for users
			// choice.
			switch (m)
			{
				case 'a':	// If a getVowels method.
				System.out.println("Total # of Vowels: " +
										 vc.getVowels());
				break;
				
				case 'b':	// If b getConsonants method.
				System.out.println("Total # of Consonants: " +
										vc.getConsonants());
				break;
				
				case 'c':	// If c getVowels and getConsonants
								// methods.
				System.out.println("Total # of Vowels: " +
										vc.getVowels());
				System.out.println("Total # of Consonants: " +
										vc.getConsonants());
				break;
				
				case 'd':	// If d get user to input string.
				line = getString();
				// Pass users keyboard input to constructor.
				vc = new VowelsAndConsonants(line);
				break;
				
				case 'e':	// If e exit program and display 
								// display message.
				goodBye();
				break;

			default:

			}
		System.out.println("Your Input: " + vc.toString());
		System.out.print("Press e to exit or y to continue: ");
		line = keyboard.nextLine();
		m = line.charAt(0);
		if(m == 'e')
			goodBye();
		else
			m = menu();
		}
	}
	/**
		getString method 
		@return str Users keyboard input.
	*/

	public static String getString()
	{
		String str;	// Holds user input
		
		// Get string from user.
		System.out.print("Enter a String: ");
		str = keyboard.nextLine();

		return str;
	}

	/**
		menu method gets a - e choice from 
		user for menu options.
	*/

	public static char menu()
	{
		String mChoice;	// Holds user input
		char choice;		// Holds char choice

		// Display Menu items.
		System.out.println("MENU:");
		System.out.println("a. Count the number " +
								"of vowels in the String");
		System.out.println("b. Count the number of " +
								"consonants in the String");
		System.out.println("c. Count both the vowels " +
								" and the consonants in the String");
		System.out.println("d. Enter another String");
		System.out.println("e. Exit the program");
		System.out.println("Choice: ");
		mChoice = keyboard.nextLine();
		choice = mChoice.charAt(0);

		// Change character to lower case
		// and return.
		return Character.toLowerCase(choice);
	}	

	/**
		goodBye method shutdown system
		and displays message.
	*/

	public static void goodBye()
	{
		// Display exit message.
		System.out.println("See Ya Soon");
		
		// Exit system.
		System.exit(0);
	}
}