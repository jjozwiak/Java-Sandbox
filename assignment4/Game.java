import java.util.ArrayList;
import java.util.Random;

public class Game
{
	private String[] words = {"Vegan", "Computer", "Painting", "Chalkboard", "Television", "A city in the midwest"};
	private String[] definitions = {"A type of dietary restriction", "Programmers use these", "An artist makes this", "Teachers use these", "People watch this", "Chicago"};
	private boolean active;
	private boolean gameWon;
	private int wordIndex;
	private int wordLength;
	private int remainingLetters;
	private String currentWord;
	private String currentDefinition;

	public ArrayList<Character> correctlyGuessedLetters;
	public Draw hangMan;
	public PlayerScore playerScore;
	public ArrayList<Character> incorrectlyGuessedLetters;
	public int invalidEntries;

	public Game()
	{
		active = true;
		invalidEntries = 0;

		Random random = new Random();
		wordIndex = random.nextInt(5);

		currentWord = chooseWordFromList(wordIndex);
		currentDefinition = chooseDefinitionFromList(wordIndex);

		wordLength = currentWord.length();
		remainingLetters = wordLength;

		correctlyGuessedLetters = new ArrayList<Character>();
		incorrectlyGuessedLetters = new ArrayList<Character>();

		//add blank placeholders to the correctlyGuessedLetters arraylist
		for(int i = 0; i<wordLength; i++)
		{
			correctlyGuessedLetters.add(' ');
		}

		hangMan = new Draw();

	}

	public String chooseWordFromList(int wordIndex)
	{
		String word = words[wordIndex];
		return word;
	}
	public String chooseDefinitionFromList(int wordIndex)
	{
		String definition = definitions[wordIndex];
		return definition;
	}
	public String getCurrentWord()
	{
		return currentWord;
	}
	public String getCurrentDefinition()
	{
		return currentDefinition;
	}
	public int getWordLength()
	{
		return wordLength;
	}
	public int getRemainingLetters()
	{
		return remainingLetters;
	}
	public void setRemainingLetters(int remainingLetters)
	{
		this.remainingLetters = remainingLetters;
	}
	public boolean getActive()
	{
		return active;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
	public void displayGameBoard()
	{
		hangMan.drawHangMan();
		hangMan.drawPlaceholder(correctlyGuessedLetters, incorrectlyGuessedLetters);
		System.out.println();
		System.out.println("Definition: " + currentDefinition);
		System.out.println();
	}
	public boolean isValid(char letter)
	{
		if(!Character.isLetter(letter)){
			return false;
		}
		return true;
	}
	public boolean isLetterInWord(String word, char letter, ArrayList<Character> lettersGuessed, ArrayList<Character> incorrectGuessed)
	{
		boolean isLetterInWord = false;
    	String normalizedWord = word.toLowerCase();
    	char normalizedLetter = Character.toLowerCase(letter);

    	for(int i = 0; i < normalizedWord.length(); i++)
    	{
    		char comparisonCharacter = normalizedWord.charAt(i);

    		if(comparisonCharacter == normalizedLetter)
    		{
    			isLetterInWord = true;

    			lettersGuessed.set(i, normalizedLetter);

    			//subtract 1 from the remaining letters
    			int num = getRemainingLetters();
    			num--;
    			setRemainingLetters(num);
    		}
    	}

    	if(isLetterInWord == false)
    	{
    		incorrectGuessed.add(normalizedLetter);
    	}

    	return isLetterInWord;
	}
	public boolean hasBeenUsed(ArrayList<Character> incorrectlyGuessedLetters, ArrayList<Character> correctlyGuessedLetters, char currentLetter)
	{
		

		boolean hasBeenUsed = false;

		for(int i = 0; i < incorrectlyGuessedLetters.size(); i++)
		{
			if(incorrectlyGuessedLetters.get(i) == currentLetter)
			{
				hasBeenUsed = true;
			}

		}

		for(int j = 0; j < correctlyGuessedLetters.size(); j++)
		{
			if(correctlyGuessedLetters.get(j) == currentLetter)
			{
				hasBeenUsed = true;
				
			}
		}

		return hasBeenUsed;
	}

}