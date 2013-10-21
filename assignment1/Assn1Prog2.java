import java.util.Scanner;

public class Assn1Prog2 {
    public static void main(String[] args){

        double distance;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a positive number for distance");

        distance = keyboard.nextDouble();

        while(distance < 0){
            System.out.println("Sorry, " + distance + " is not a valid value.");
            System.out.println("Please enter a number equal or greater than 0.");

            distance = keyboard.nextDouble();
        }

        System.out.println("The distance is " + distance + " meters.");
    }
}