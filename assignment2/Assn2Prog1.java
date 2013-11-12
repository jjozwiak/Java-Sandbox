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

            System.out.print("Please enter show room name: ");
            keyboard.nextLine();

            System.out.print("Please enter show room city: ");
            keyboard.nextLine();

            System.out.print("Please enter show room state: ");
            keyboard.nextLine();

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
                    if(escondidoProMax == 0){
                        System.out.println("Sorry, the daily limit for Pro has been reached.");
                    }
                    else
                    {
                        int remainder = currentProMaxOrderValue - escondidoProMax;
                        escondidoProMax = 0;
                        System.out.println("Your order exceeds the remaining amount of Pro available. An order has been placed for the remaining amount of: " + remainder);
                    }
                }
                else
                {
                    escondidoProMax -= currentProMaxOrderValue;
                }
            }

            System.out.print("Please enter order for designer line: ");

            int currentDesignerOrderValue = keyboard.nextInt();

            //validate the user input. Users cannot exceed 100 for Pro. They are given 3 opportunities to
            //enter correct data then the program will terminate.
            while(currentDesignerOrderValue > 120 && terminate == false)
            {
                System.out.print("Sorry the maximum order for Designer is 120. Please enter a new value: ");
                currentDesignerOrderValue = keyboard.nextInt();

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


            if(raleighDesignerMax > 0)
            {
                if(raleighDesignerMax < currentDesignerOrderValue)
                {
                    int remainder = currentDesignerOrderValue - raleighDesignerMax;
                    raleighDesignerMax = 0;
                    pellaDesignerMax -= remainder;
                }
                else
                {
                    raleighDesignerMax -= currentDesignerOrderValue;
                }
            }
            else if(pellaDesignerMax > 0)
            {
                if(pellaDesignerMax < currentDesignerOrderValue)
                {
                    int remainder = currentDesignerOrderValue - pellaDesignerMax;
                    pellaDesignerMax = 0;
                    escondidoDesignerMax -= remainder;
                }
                else
                {
                    pellaDesignerMax -= currentDesignerOrderValue;
                }
            }
            else
            {
                if(escondidoDesignerMax < currentDesignerOrderValue)
                {
                    if(escondidoDesignerMax == 0){
                        System.out.println("Sorry, the daily limit for Designer has been reached.");
                    }
                    else
                    {
                        int remainder = currentDesignerOrderValue - escondidoDesignerMax;
                        escondidoDesignerMax = 0;
                        System.out.println("Your order exceeds the remaining amount of Designer available. An order has been placed for the remaining amount of: " + remainder);
                    }

                }
                else
                {
                    escondidoDesignerMax -= currentDesignerOrderValue;
                }
            }


            if(terminate != true)
            {
                System.out.print("Enter 0 to continue or -1 if you are finished:");
                stop = keyboard.nextInt();

                while(stop != 0 && stop != -1)
                {
                    System.out.println("Sorry, that is not a valid entry. Please enter a 0 to continue or -1 if you are finished entering orders.");
                    stop = keyboard.nextInt();
                }
            }
            keyboard.nextLine();
        }

        if(terminate != true)
        {
            //give totals
            int proMaxTotal = 975 - raleighProMax - pellaProMax - escondidoProMax;
            int designerTotal = 525 - raleighDesignerMax - pellaDesignerMax - escondidoDesignerMax;

            int raleighProMaxTotal = 300 - raleighProMax;
            int pellaProMaxTotal = 475 - pellaProMax;
            int escondidoProMaxTotal = 200 - escondidoProMax;

            int raleighDesignerTotal = 150 - raleighDesignerMax;
            int pellaDesignerTotal =  275 - pellaDesignerMax;
            int escondidoDesignerTotal = 100 - escondidoDesignerMax;

            System.out.println();
            System.out.println("Total number of Pro line ordered: " + proMaxTotal);
            System.out.println("Total number of Designer line ordered: " + designerTotal);

            System.out.println("Raleigh Pro producion totals: " + raleighProMaxTotal);
            System.out.println("Raleigh Designer production totals: " + raleighDesignerTotal);

            System.out.println("Pella Pro production totals: " + pellaProMaxTotal);
            System.out.println("Pella Designer production totals: " + pellaDesignerTotal);

            System.out.println("Escondido Pro production totals: " +  escondidoProMaxTotal);
            System.out.println("Escondido Designer production totals: " + escondidoDesignerTotal);

        }
        else
        {
            System.out.println("The program terminated prematurely because you exceeded the daily limit too many times.");
        }
    }
}