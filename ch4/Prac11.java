import java.util.Scanner;

public class Prac11 {
    public static void main(String[] args) {

    	int x;

    	Scanner keyboard = new Scanner(System.in);

    	System.out.println("Please enter a number between 1 and 4.");

    	x = keyboard.nextInt();

        while(x < 1 || x > 4)
        {
        	System.out.println("Please enter a number between 1 and 4.");
        	x = keyboard.nextInt();
        }

    }
}