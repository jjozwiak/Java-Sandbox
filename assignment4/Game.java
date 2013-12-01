import java.util.ArrayList;

public class Game
{
	private String[] words = {"Word1ss", "Word2fdddd", "Word3fd"};
	private String[] definitions = {"Definition 1", "Def 2", "this word is ..."};
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

		//TODO: set word index randomly with upper limit of size of words array
		wordIndex = 2;

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
	public boolean isInWord()
	{
		return false;
	}
	public boolean hasBeenUsed()
	{
		return false;
	}

	//TODO create toString class for debugging
}