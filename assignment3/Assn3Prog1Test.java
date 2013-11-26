import java.util.Scanner;
import java.io.*;

public class Assn3Prog1Test 
{
    public static void main(String[] args)
    {
    	int totalNumberOfWeeks = 0;
        int totalZeroRainDays = 0;
        int totalRainDays = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many weeks of rainfall are you going to record? ");

        totalNumberOfWeeks = keyboard.nextInt();

        //Loop validation. Make sure user enters a valid number
        while(totalNumberOfWeeks <= 0) {
            System.out.println("You must enter a number greater than 0");
            System.out.println("How many weeks of rainfall are you going to record?");

            totalNumberOfWeeks = keyboard.nextInt();
        }

        //create an array that will hold all of our week objects
        Assn3Prog1[] weeks = new Assn3Prog1[totalNumberOfWeeks];

        for(int i = 0; i < totalNumberOfWeeks; i++)
        {

        	//create a new array to hold the values for the week
        	double[] dailyValues = new double[7];

        	for(int j = 0; j < 7; j++)
            {

                double inchesOfRain = 0;
                int day = j + 1;
                int week = i + 1;
                System.out.print("How many inches of rain were recorded on Day" + day +" of Week" + week + "? ");
                inchesOfRain = keyboard.nextDouble();

                if(inchesOfRain == 0)
                {
                    totalZeroRainDays++;
                }
                else
                {
                    totalRainDays++;
                }

                dailyValues[j] = inchesOfRain;
            }

            //Create a new week object with the array we just created
        	Assn3Prog1 currentWeek = new Assn3Prog1(dailyValues);
            
            //Add our newly created week object to the weeks array
        	weeks[i] = currentWeek;

        }

        double day1Totals = 0;
        double day2Totals = 0;
        double day3Totals = 0;
        double day4Totals = 0;
        double day5Totals = 0;
        double day6Totals = 0;
        double day7Totals = 0;

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

        System.out.println("Total number of weeks: " + totalNumberOfWeeks);
        System.out.println("Total days with greater than 0 inches of rainfall: " + totalRainDays);
        System.out.println("Total days with 0 inches of rainfall: " + totalZeroRainDays);
        System.out.printf("Total inches of rain: %.2f \n", totalInchesOfRain);
        System.out.printf("Day 1 Average: %.2f \n", day1Average);
        System.out.printf("Day 2 Average: %.2f \n", day2Average);
        System.out.printf("Day 3 Average: %.2f \n", day3Average);
        System.out.printf("Day 4 Average: %.2f \n", day4Average);
        System.out.printf("Day 5 Average: %.2f \n", day5Average);
        System.out.printf("Day 6 Average: %.2f \n", day6Average);
        System.out.printf("Day 7 Average: %.2f \n", day7Average);

        for(int i = 0; i < weeks.length ; i++)
        {
            int displayNum = i + 1;
            System.out.printf("Week " + displayNum + " average: %.2f \n", weeks[i].getWeekAverage());
        }



    }
}