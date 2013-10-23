import java.util.Scanner;
import java.io.*;

public class Assn1Prog1 
{
    public static void main(String[] args)
    {      

        int totalNumberOfWeeks = 0;
        int totalDaysGreaterThanZero = 0;
        int totalWeeksGreaterThanZero = 0;
        int totalDaysWithZero = 0;

        double weekOneAverage = 0;
        double weekTwoAverage = 0;
        double weekThreeAverage = 0;
        double weekFourAverage = 0;
        double weekFiveAverage = 0;
        double weekSixAverage = 0;

        double day1Totals = 0;
        double day2Totals = 0;
        double day3Totals = 0;
        double day4Totals = 0;
        double day5Totals = 0;
        double day6Totals = 0;
        double day7Totals = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many weeks of rainfall are you going to record? Please enter a number from one to six.");

        totalNumberOfWeeks = keyboard.nextInt();

        //Loop validation. Make sure user enters a valid number
        while(totalNumberOfWeeks <= 0 || totalNumberOfWeeks > 6) {
            System.out.println("You must enter a number from one to six.");
            System.out.println("How many weeks of rainfall are you going to record?");

            totalNumberOfWeeks = keyboard.nextInt();
        }

        for(int i = 1; i <= totalNumberOfWeeks; i++)
        {

            double currentWeekTotal = 0;

            for(int j = 1; j <= 7; j++)
            {

                double inchesOfRain = 0;

                System.out.println("How many inches of rain were recorded on Day" + j +" of Week" + i + ".");
                inchesOfRain = keyboard.nextDouble();

                currentWeekTotal += inchesOfRain;

                //Make sure user does not enter negative number for rainfall
                while(inchesOfRain < 0)
                {
                    System.out.println("Please enter number equal or greater than zero");
                    inchesOfRain = keyboard.nextDouble();
                }

                switch(j)
                {
                    case 1:
                        day1Totals += inchesOfRain;
                        break;
                    case 2:
                        day2Totals += inchesOfRain;
                        break;
                    case 3:
                        day3Totals += inchesOfRain;
                        break;
                    case 4:
                        day4Totals += inchesOfRain;
                        break;
                    case 5:
                        day5Totals += inchesOfRain;
                        break;
                    case 6:
                        day6Totals += inchesOfRain;
                        break;
                    case 7:
                        day7Totals += inchesOfRain;
                        break;
                }

                if(inchesOfRain > 0)
                {
                    ++totalDaysGreaterThanZero;
                }
                else
                {
                    ++totalDaysWithZero;
                }
            }


            switch(i)
            {
                case 1:
                    weekOneAverage = currentWeekTotal/7;
                    break;
                case 2:
                    weekTwoAverage = currentWeekTotal/7;
                    break;
                case 3:
                    weekThreeAverage = currentWeekTotal/7;
                    break;
                case 4:
                    weekFourAverage = currentWeekTotal/7;
                    break;
                case 5:
                    weekFiveAverage = currentWeekTotal/7;
                    break;
                case 6:
                    weekSixAverage = currentWeekTotal/7;
                    break;
            }
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
        System.out.println("Total days with greater than 0 inches of rainfall: " + totalDaysGreaterThanZero);
        System.out.println("Total days with 0 inches of rainfall: " + totalDaysWithZero);
        System.out.println("Total inches of rain: " + totalInchesOfRain );

        System.out.printf("Day1 Average: %.2f \n", day1Average);
        System.out.printf("Day2 Average: %.2f \n", day2Average);
        System.out.printf("Day3 Average: %.2f \n", day3Average);
        System.out.printf("Day4 Average: %.2f \n", day4Average);
        System.out.printf("Day5 Average: %.2f \n", day5Average);
        System.out.printf("Day6 Average: %.2f \n", day6Average);
        System.out.printf("Day7 Average: %.2f \n", day7Average);

        for(int i = 1; i <= totalNumberOfWeeks; i++)
        {
            switch(i)
            {
                case 1:
                    System.out.printf("Week " + i + " average: %.2f \n", weekOneAverage);
                    break;
                case 2:
                    System.out.printf("Week " + i + " average: %.2f \n", weekTwoAverage);
                    break;
                case 3:
                    System.out.printf("Week " + i + " average: %.2f \n", weekThreeAverage);
                    break;
                case 4:
                    System.out.printf("Week " + i + " average: %.2f \n", weekFourAverage);
                    break;
                case 5:
                    System.out.printf("Week " + i + " average: %.2f \n", weekFiveAverage);
                    break;
                case 6:
                    System.out.printf("Week " + i + " average: %.2f \n", weekSixAverage);
                    break;
            }
        }
    }
}