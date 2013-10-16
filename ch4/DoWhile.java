import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

    	int num1;
    	int num2;
    	int cont;

    	do
        {

        	Scanner keyboard = new Scanner(System.in);

        	System.out.println("Enter a number.");
        	
        	num1 = keyboard.nextInt();

        	System.out.println("Enter another number.");

        	num2 = keyboard.nextInt();

        	int sum = num1 + num2;

        	System.out.println("num1 + num2 = " + sum);

        	System.out.println("Woud you like to perform this operation again? Enter 1 for yes and 0 for no.");

        	cont = keyboard.nextInt();

        	while(cont != 1 && cont != 0)
        	{
        		System.out.println("Please enter either a 1 or a 0.");
        		cont = keyboard.nextInt();
        		keyboard.nextLine();
        	}

        }
        while(cont == 1);
        
    }
}