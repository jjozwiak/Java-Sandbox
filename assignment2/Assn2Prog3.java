import java.util.Scanner;
import java.io.*;

public class Assn2Prog3 
{
    public static void main(String[] args)
    {      

        String name = "John Smith";
        double grade1 = 70;
        double grade2 = 80;
        double grade3 = 90;
        double grade4 = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the name of a file without the file extension (ex: .txt): ");

        String fileName = keyboard.nextLine();

        while(! fileName.equals("filename"))
        {
            System.out.println("Sorry, a file of that name does not exist.");
            System.out.print("Please enter the name of another file: ");
            fileName = keyboard.nextLine();
        }

        double average = calculateAverage(grade1, grade2, grade3, grade4);

        char grade = calculateGrade(average);

        System.out.println(name + "'s four grades are: " + grade1 + ", " + grade2 + ", " + grade3 + ", and " + grade4 + ". The grade average is: " + average + " and the letter grade is: " + grade + ".");

    }
    /**
     * [calculateAverage description]
     * @param  grade1 [description]
     * @param  grade2 [description]
     * @param  grade3 [description]
     * @param  grade4 [description]
     * @return        [description]
     */
    public static double calculateAverage(double grade1, double grade2, double grade3, double grade4)
    {
        double average;
        double sum;

        sum = grade1 + grade2 + grade3 + grade4;
        average = sum/4;

        return average;
    }

    public static char calculateGrade(double average)
    {
        if(average >= 90)
        {
            return 'A';
        }
        else if(average >= 80)
        {
            return 'B';
        }
        else if(average >= 70)
        {
            return 'C';
        }
        else if(average >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }

}