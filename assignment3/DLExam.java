import java.util.ArrayList;
import java.io.*;


public class DLExam
{
	String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};

	String[] userAnswers = new String[20];

	public void writeUserAnswersToFile() throws IOException
	{
		PrintWriter outputFile = new PrintWriter("answers.txt");

		for(int i = 0; i < userAnswers.length; i++)
		{
			if(userAnswers[i] != null){
				outputFile.println(userAnswers[i]);
			}

		}

		outputFile.close();
	}

	public void getUserAnswersFromFile()
	{

	}

	public boolean passed()
	{
		int totalCorrect = totalCorrect();
		if(totalCorrect > 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int totalCorrect()
	{

		int totalCorrect = 0;

		for(int i = 0; i < correctAnswers.length; i++)
		{

			if(correctAnswers[i].equals(userAnswers[i]))
			{
				totalCorrect++;
			}
		}
		return totalCorrect;
	}

	public int totalIncorrect()
	{
		int totalIncorrect = 0;

		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(!correctAnswers[i].equals(userAnswers[i]))
			{
				totalIncorrect++;
			}
		}

		return totalIncorrect;
	}

	public ArrayList questionsMissed()
	{

		ArrayList<String> missed = new ArrayList<String>();

		int missedIndex = 0;

		for(int i = 0; i < correctAnswers.length; i++)
		{
			if(!correctAnswers[i].equals(userAnswers[i]))
			{

				missed.add(String.valueOf(i + 1));
				missedIndex++;
			}
		}
		return missed;
	}





}