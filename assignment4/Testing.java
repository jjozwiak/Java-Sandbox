import java.util.ArrayList;

public class Testing
{
	public static void main(String[] args)
    {
    	ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    	String string = "testing";

    	for(int i = 0; i < string.length(); i++)
    	{
    		lettersGuessed.add(' ');
    	}

    	boolean result = isLetterInWord(string, 'i', lettersGuessed);

    	for(int j = 0; j < string.length(); j++)
    	{
    		System.out.print(lettersGuessed.get(j));
    	}

    	System.out.println(result);
    }
    public static boolean isLetterInWord(String word, char letter, ArrayList<Character> lettersGuessed)
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
}