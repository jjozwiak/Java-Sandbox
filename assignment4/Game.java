import java.util.ArrayList;
import java.util.Random;

public class Game
{
	private String[] words = {"Puppy", "Crabby", "SomeWord", "anotherword"};
	private String[] definitions = {"Definition 1", "Def 2", "this word is ...", "sffsdfs"};
	private boolean active;
	private boolean gameWon;
	private int wordIndex;
	private int wordLength;
	private String currentWord;
	private String currentDefinition;

	public ArrayList<Character> correctlyGuessedLetters;
	public Draw hangMan;
	public ArrayList<Character> incorrectlyGuessedLetters;

	public Game()
	{
		active = true;

		Random random = new Random();
		wordIndex = random.nextInt(7);

		currentWord = chooseWordFromList(wordIndex);
		currentDefinition = chooseDefinitionFromList(wordIndex);

		wordLength = currentWord.length();

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
		hangMan.drawPlaceholder(correctlyGuessedLetters);
		System.out.println("Definition: " + currentDefinition);
	}
	public boolean isValid()
	{
		//is this a letter
		return false;
	}
	public boolean isLetterInWord(String word, char letter, ArrayList<Character> lettersGuessed)
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

    			//add letter to correctly guessed array list
    			//System.out.println(i);
    			lettersGuessed.add(i, normalizedLetter);
    		}
    	}
    	return isLetterInWord;
	}
	public boolean hasBeenUsed(ArrayList incorrectlyGuessedLetters, char currentLetter)
	{
		boolean hasBeenUsed = false;

		return hasBeenUsed;
	}

	//TODO create toString class for debugging
}