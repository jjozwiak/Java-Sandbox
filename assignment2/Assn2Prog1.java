import java.util.Scanner;

public class Assn2Prog1 
{
    public static void main(String[] args)
    {      

        int escondidoProMax = 200;
        int escondidoDesignerMax = 100;
        int pellaProMax = 475;
        int pellaDesignerMax = 275;
        int raleighProMax = 300;
        int raleighDesignerMax = 150;

        int countOfInvalidEntries = 0;

        int stop = 0;
        boolean terminate = false;

        Scanner keyboard = new Scanner(System.in);

        while(terminate == false && stop != -1)
        {
            System.out.print("Please enter order for pro line: ");

            int currentProMaxOrderValue = keyboard.nextInt();

            //validate the user input. Users cannot exceed 100 for Pro. They are given 3 opportunities to
            //enter correct data then the program will terminate.
            while(currentProMaxOrderValue > 100 && terminate == false)
            {
                System.out.print("Sorry the maximum order for Pro is 100. Please enter a new value: ");
                currentProMaxOrderValue = keyboard.nextInt();

                if(countOfInvalidEntries == 2)
                {
                    terminate = true;
                }
                else
                {
                    ++countOfInvalidEntries;
                }

            }

            //if we reach this point, the user has entered a valid value within the alotted number of times
            //so we'll reset the counter to 0 for the next set of entries.
            countOfInvalidEntries = 0;

            if(raleighProMax > 0)
            {
                if(raleighProMax < currentProMaxOrderValue)
                {
                    int remainder = currentProMaxOrderValue - raleighProMax;
                    raleighProMax = 0;
                    pellaProMax -= remainder;
                }
                else
                {
                    raleighProMax -= currentProMaxOrderValue;
                }
            }
            else if(pellaProMax > 0)
            {
                if(pellaProMax < currentProMaxOrderValue)
                {
                    int remainder = currentProMaxOrderValue - pellaProMax;
                    pellaProMax = 0;
                    escondidoProMax -= remainder;
                }
                else
                {
                    pellaProMax -= currentProMaxOrderValue;
                }
            }
            else
            {
                if(escondidoProMax < currentProMaxOrderValue)
                {
                    escondidoProMax -= currentProMaxOrderValue;
                }
                else
                {
                    escondidoProMax -= currentProMaxOrderValue;
                }
            }
            System.out.println("Raleigh: " + raleighProMax);
            System.out.println("Pella: " + pellaProMax);
            System.out.println("Escondido: " + escondidoProMax);

            if(terminate != true)
            {
                System.out.print("Enter 0 to continue or -1 if you are finished:");
                stop = keyboard.nextInt(); 
            }

        }

        if(terminate != true)
        {
            //give totals
        }
        else
        {
            System.out.println("The program terminated prematurely because you exceeded the daily limit too many times.");
        }
    }
}