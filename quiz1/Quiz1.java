import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        final double BASE_RATE = 10;
        int numberOfChecks;
        double total;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many checks did you write?");

        numberOfChecks = keyboard.nextInt();

        if (numberOfChecks < 20) {
            total = BASE_RATE + numberOfChecks * .10;
        } else if (numberOfChecks < 40) {
            total = BASE_RATE + numberOfChecks * .08;
        } else if (numberOfChecks < 60) {
            total = BASE_RATE + numberOfChecks * .06;
        } else {
            total = BASE_RATE + numberOfChecks * .04;
        }

        //total = 13.987;

        System.out.printf("Your total fees are $%.2f", total);
        System.out.println();
        
    }
}