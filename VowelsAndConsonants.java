/**
	Alexander Waters I.D:23598844
	Computer Programming 2
	Chapter 9 #04
	Vowels and Consonants Class
*/

public class VowelsAndConsonants
{
	// Fields
	private String line;

	/**
		Empty constructor
	*/

	public VowelsAndConsonants()
	{

	}

	/**
		Constructor
		@param str Text from driver class.
	*/

	public VowelsAndConsonants(String str)
	{
		this.line = str;
	}

	/**
		Copy Constructor
		@param object2 Copies fields.
	*/

	public VowelsAndConsonants(VowelsAndConsonants object2)
	{
		this.line = object2.line;
	}

	/**
		getVowels method
		@return Count number of vowels.
	*/

	public int getVowels()
	{
		// Create a char array of line.
		char[] letters = line.toCharArray(); 
		int count = 0; 	// Holds running count
								// for number of vowels.
		
		// Check each character in letters array
		// and count vowels.
		for (char c : letters) 
		{ 
			switch (c) 
			{ 
				case 'a': 
				case 'e': 
				case 'i': 
				case 'o': 
				case 'u': 
				count++; 
				break; 
			default:
			}
		}
		
		return count;
	}

	/**
		getConsonants method
		@return Count of consonants in 
				  letters array.
	*/

	public int getConsonants()
	{
		// Make line all lowerCase.
		line = line.toLowerCase();

		// Create char array of letters.
		char[] letters = line.toCharArray(); 
		int count = 0; 	//  Holds running total
								//  total of consonants.
		
		// Count ever consonant in
		// letters array.
		for (char c : letters) 
		{ 
			// Only count letters a - z.
			if(c >= 'a' && c <= 'z')
				count++;	// Plus one if consonant.
			
			// Subtract vowels from count.
			if(c == 'a' || c == 'e' || c == 'i' || 
				c == 'o' || c == 'u')
				count--;	// Minus one if vowel.
		}
		
		return count;
	}

	/**
		equals method
		@param Object2.
		@return True if equal.
	*/

	public boolean equals(VowelsAndConsonants object2)
	{
		boolean status;	// Flag variable

		if(this.getVowels() == object2.getVowels() &&
			this.getConsonants() == object2.getConsonants())
				status = true;
		else
			status = false;

		return status;
	}

	/**
		toString method
		@return Line of field.
	*/

	public String toString()
	{
		// SnapShot of field.
		String str = "Line: " + line;

		return line;
	}
}