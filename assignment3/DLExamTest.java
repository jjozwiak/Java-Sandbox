import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class DLExamTest 
{
    public static void main(String[] args) throws IOException
    {
    	int currentQuestion = 0;
    	int incorrectAnswerCount = 0;

    	Scanner keyboard = new Scanner(System.in);

    	DLExam exam = new DLExam();

    	//if answers file exist
    	//ask if user would like to load prior answers
    	//user answers yes - loop through file and assign answers to user answers array and set the current question
    	//user answers no - empty the file and have user start from scratch

    	//ask user to enter answer for each question
    	while(currentQuestion < exam.userAnswers.length)
    	{
    		System.out.print("Enter your answer for question " + currentQuestion + ": ");

    		String currentAnswer = keyboard.nextLine();

    		while(!currentAnswer.equals("A") && !currentAnswer.equals("B") && !currentAnswer.equals("C") && !currentAnswer.equals("D"))
    		{
    			incorrectAnswerCount++;

    			if(incorrectAnswerCount > 2)
    			{
    				System.out.println("Sorry you entered an invalid option too many times. The program is now exiting.");

    				System.out.print("enter 'yes' if you would like to save your answers: ");

    				String save = keyboard.nextLine();

    				if(save.equals("yes"))
    				{
    					System.out.println("Answers were saved to file.");
    					
    					exam.writeUserAnswersToFile();
    				}
    				else
    				{
    					System.out.println("Answers discarded.");
    				}

    				System.exit(0);
    			}

    			System.out.println("Sorry that's not a valid answer. You must enter A, B, C, or D");
    			System.out.print("Please enter your answer again: ");

    			currentAnswer = keyboard.nextLine();
    		}

    		//if we get here let's reset this to 0.
    		incorrectAnswerCount = 0;

    		//add the current answer to the user answers array.
    		exam.userAnswers[currentQuestion] = currentAnswer;

    		++currentQuestion;
    	}


    	System.out.println("Total Correct Answers: " + exam.totalCorrect());
    	System.out.println("Total Incorrect Answers: " + exam.totalIncorrect());
    	System.out.println(exam.passed());

    	exam.writeUserAnswersToFile();

    	ArrayList missedArray = exam.questionsMissed();

    	for(int i = 0; i < missedArray.size(); i++)
    	{
    		System.out.println(missedArray.get(i));
    	}


    }
}