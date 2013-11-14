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

    	//System.out.println(exam.getNumberOfAnswersFromFile());


    	if(exam.getNumberOfAnswersFromFile() > 0)
    	{
    		System.out.print("Would you like to use your answers from the previous round? 'yes' or 'no':");

    		String loadAnswers = keyboard.nextLine();

    		if(loadAnswers.equals("yes"))
    		{
    			currentQuestion = exam.getNumberOfAnswersFromFile();
    			exam.getUserAnswersFromFile();
    		}
    		else
    		{
    			exam.clearAnswersFile();
    		}

    	}


    	//ask user to enter answer for each question
    	while(currentQuestion < exam.userAnswers.length)
    	{
    		int currentPrintedQuestion = currentQuestion + 1;
    		System.out.print("Enter your answer for question " + currentPrintedQuestion + ": ");

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

    					exam.clearAnswersFile();
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


    	if(exam.passed())
    	{
    		System.out.println("Congratulations! You passed the exam. Below are your results.");
    	}
    	else
    	{
    		System.out.println("Sorry:( You did not pass the exam. Below are your results.");
    	}
    	

    	System.out.println("Total Correct Answers: " + exam.totalCorrect());
    	System.out.println("Total Incorrect Answers: " + exam.totalIncorrect());

    	ArrayList missedArray = exam.questionsMissed();

    	if(missedArray.size() > 0){

	    	System.out.println("Below are the questions you did not get correct.");

	    	for(int i = 0; i < missedArray.size(); i++)
	    	{
	    		System.out.println(missedArray.get(i));
	    	}

    	}

    	//if we get her let's clear the answers file for the next user
    	exam.clearAnswersFile();

    }
}