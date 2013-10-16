import java.util.Scanner;
import java.io.*;

public class Assn1Prog1 {
    public static void main(String[] args) throws IOException{

        final String OUTPUT_FILE_NAME = "weekaverages.txt";        

        int totalNumberOfWeeks = 0;
        int totalDaysGreaterThanZero = 0;
        int totalWeeksGreaterThanZero = 0;
        int totalDaysWithZero = 0;

        double day1Totals = 0;
        double day2Totals = 0;
        double day3Totals = 0;
        double day4Totals = 0;
        double day5Totals = 0;
        double day6Totals = 0;
        double day7Totals = 0;

        //create new file to hold weekly averages
        PrintWriter newOutputFile = new PrintWriter(OUTPUT_FILE_NAME);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many weeks of rainfall are you going to record?");

        totalNumberOfWeeks = keyboard.nextInt();

        //Loop validation. Make sure user enters a valid number
        while(totalNumberOfWeeks <= 0) {
            System.out.println("You must enter a number greater than 0.");
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

            FileWriter fwriter = new FileWriter(OUTPUT_FILE_NAME, true);
            PrintWriter outputFile = new PrintWriter(fwriter);
            outputFile.printf("Week " + i + " average: %.2f \n", currentWeekTotal/7);
            outputFile.close();
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

        File file = new File(OUTPUT_FILE_NAME);
        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext())
        {
            String weekAverage = inputFile.nextLine();

            System.out.println(weekAverage);
        }

        inputFile.close();

    }
}