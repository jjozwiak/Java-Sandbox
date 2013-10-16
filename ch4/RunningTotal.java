import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {

    	int num = 0;
    	int total = 0;

    	for(int i = 1; i <=10; i++ )
    	{
    		Scanner keyboard = new Scanner(System.in);

    		System.out.println("Please enter a number");

    		num = keyboard.nextInt();

    		total += num;
    	}

    	System.out.println("The total is " + total);
        
    }
}