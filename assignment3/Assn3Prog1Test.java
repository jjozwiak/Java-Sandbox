import java.util.Scanner;
import java.io.*;

public class Assn3Prog1Test 
{
    public static void main(String[] args)
    {
    	int totalNumberOfWeeks = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many weeks of rainfall are you going to record?");

        totalNumberOfWeeks = keyboard.nextInt();

        //Loop validation. Make sure user enters a valid number
        while(totalNumberOfWeeks <= 0) {
            System.out.println("You must enter a number greater than 0");
            System.out.println("How many weeks of rainfall are you going to record?");

            totalNumberOfWeeks = keyboard.nextInt();
        }

        //create an array that will hold all of our week objects
        Assn3Prog1[] weeks = new Assn3Prog1[totalNumberOfWeeks];

        //TODO change totalNumOfWeeks to length attr.
        for(int i = 0; i < totalNumberOfWeeks; i++)
        {

        	//create a new array to hold the values for the week
        	double[] dailyValues = new double[7];

        	for(int j = 0; j < 7; j++)
            {

                double inchesOfRain = 0;

                System.out.println("How many inches of rain were recorded on Day" + j +" of Week" + i + "?");
                inchesOfRain = keyboard.nextDouble();

                dailyValues[j] = inchesOfRain;
            }

            //Create a new week object with the array we just created
        	Assn3Prog1 currentWeek = new Assn3Prog1(dailyValues);
            
            //Add our newly created week object to the weeks array
        	weeks[i] = currentWeek;

        }

        double day1Totals;
        double day2Totals;
        double day3Totals;
        double day4Totals;
        double day5Totals;
        double day6Totals;
        double day7Totals;

        for(int i = 0; i < totalNumberOfWeeks; i++)
        {
        	day1Totals += weeks[i].getDay1Total();
        	day2Totals += weeks[i].getDay2Total();
        	day3Totals += weeks[i].getDay3Total();
        	day4Totals += weeks[i].getDay4Total();
        	day5Totals += weeks[i].getDay5Total();
        	day6Totals += weeks[i].getDay6Total();
        	day7Totals += weeks[i].getDay7Total();
        }

        double totalInchesOfRain = day1Totals + day2Totals + day3Totals + day4Totals + day5Totals + day6Totals + day7Totals;

        double day1Average = day1Totals/totalNumberOfWeeks;
        double day2Average = day2Totals/totalNumberOfWeeks;
        double day3Average = day3Totals/totalNumberOfWeeks;
        double day4Average = day4Totals/totalNumberOfWeeks;
        double day5Average = day5Totals/totalNumberOfWeeks;
        double day6Average = day6Totals/totalNumberOfWeeks;
        double day7Average = day7Totals/totalNumberOfWeeks;

        // System.out.println("Total number of weeks: " + totalNumberOfWeeks);
        // System.out.println("Total days with greater than 0 inches of rainfall: " + totalDaysGreaterThanZero);
        // System.out.println("Total days with 0 inches of rainfall: " + totalDaysWithZero);
        // System.out.println("Total inches of rain: " + totalInchesOfRain );

        // System.out.printf("Day1 Average: %.2f \n", day1Average);
        // System.out.printf("Day2 Average: %.2f \n", day2Average);
        // System.out.printf("Day3 Average: %.2f \n", day3Average);
        // System.out.printf("Day4 Average: %.2f \n", day4Average);
        // System.out.printf("Day5 Average: %.2f \n", day5Average);
        // System.out.printf("Day6 Average: %.2f \n", day6Average);
        // System.out.printf("Day7 Average: %.2f \n", day7Average);

        // for(int i = 1; i <= totalNumberOfWeeks; i++)
        // {
        //     switch(i)
        //     {
        //         case 1:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekOneAverage);
        //             break;
        //         case 2:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekTwoAverage);
        //             break;
        //         case 3:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekThreeAverage);
        //             break;
        //         case 4:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekFourAverage);
        //             break;
        //         case 5:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekFiveAverage);
        //             break;
        //         case 6:
        //             System.out.printf("Week " + i + " average: %.2f \n", weekSixAverage);
        //             break;
        //     }
        // }
    }
}