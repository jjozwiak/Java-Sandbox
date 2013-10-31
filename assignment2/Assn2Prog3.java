import java.util.Scanner;
import java.io.*;

public class Assn2Prog3 
{
    public static void main(String[] args) throws IOException
    {      

        String name = "";
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double grade4 = 0;

        int numberOfLines = 0;
        int numberOfStudents = 0;
        int iterator = 1;

        double grade1ClassTotals = 0;
        double grade2ClassTotals = 0;
        double grade3ClassTotals = 0;
        double grade4ClassTotals = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the name of a file including the file extension (ex: grades.txt): ");
        String fileName = keyboard.nextLine();

        File gradeFile = new File(fileName);

        //Exit the program if the file does not exist
        if(!gradeFile.exists())
        {
            System.out.println("The file name you entered does not exist.");
            System.exit(0);
        }

        Scanner inputFile2 = new Scanner(gradeFile);

        while(inputFile2.hasNext())
        {

            ++numberOfLines;
            if(iterator == 5)
            {
                grade4 = Double.parseDouble(inputFile2.nextLine());

                double average = calculateAverage(grade1, grade2, grade3, grade4);
                char grade = calculateGrade(average);

                System.out.println(name + "'s four grades are: " + grade1 + ", " + grade2 + ", " + grade3 + ", and " + grade4 + ". The grade average is: " + average + " and the letter grade is: " + grade + ".");

                grade4ClassTotals += grade4;
                iterator = 1;
            }
            else
            {

                if(iterator == 1){
                    name = inputFile2.nextLine();
                }
                else if (iterator == 2)
                {
                    grade1 = Double.parseDouble(inputFile2.nextLine());
                    grade1ClassTotals += grade1;
                }
                else if (iterator == 3)
                {
                    grade2 = Double.parseDouble(inputFile2.nextLine());
                    grade2ClassTotals += grade2;
                }
                else
                {
                    grade3 = Double.parseDouble(inputFile2.nextLine());
                    grade3ClassTotals += grade3;
                }
                ++iterator;
            }
        }

        System.out.println();

        numberOfStudents = numberOfLines/5;

        System.out.println("Grade 1 Class Average: " + grade1ClassTotals/numberOfStudents);
        System.out.println("Grade 2 Class Average: " + grade2ClassTotals/numberOfStudents);
        System.out.println("Grade 3 Class Average: " + grade3ClassTotals/numberOfStudents);
        System.out.println("Grade 4 Class Average: " + grade4ClassTotals/numberOfStudents);

        inputFile2.close();
    }

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