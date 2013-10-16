import java.util.Scanner;

public class Prac12 {
    public static void main(String[] args) {

    	String value;

    	Scanner keyboard = new Scanner(System.in);

    	System.out.println("Please enter yes or no.");

    	value = keyboard.next();

        while(!value.equals("yes") && !value.equals("no"))
        {
        	System.out.println("Please enter yes or no.");
            value = keyboard.next();
        }

    }
}