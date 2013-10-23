import java.util.Scanner;

public class Assn1Prog3 {
	public static void main(String[] args){

		double futureValue = 0;
		double interestRate = 0;
		double numberOfYears = 0;
		double currentValue = 0;
		double presentValue = 0;
		int iterator = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a future value");

		currentValue = keyboard.nextDouble();

		while(currentValue >= 0)
		{
			switch(iterator)
			{	
				case 0:
    				futureValue = currentValue;
    				System.out.println("Please enter an interest rate");
    				currentValue = keyboard.nextDouble();
    				break;
    			case 1:
    				interestRate = currentValue;
    				System.out.println("Please enter number of years");
    				currentValue = keyboard.nextDouble();
    				break;
    			case 2:
    				numberOfYears = currentValue;
    				currentValue = -1;
    				break;
    		}

    		++iterator;
    	}

    	if(iterator < 3)
    	{
    		System.out.println("This program is ending because " + currentValue + " is an invalid input.");
    	}
    	else
    	{
    		presentValue = presentValue(futureValue, interestRate, numberOfYears);
    		System.out.printf("Your present value is: %f \n", presentValue);
    	}

    }

    public static double presentValue(double futureValue, double interestRate, double numberOfYears)
    {
    	double presentValue;

    	//Math.pow(4.0, 2.0)
    	presentValue = futureValue/Math.pow((1 + interestRate), numberOfYears);

    	return presentValue;
    }
}