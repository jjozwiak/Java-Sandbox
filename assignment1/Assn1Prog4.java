import java.util.Scanner;
import java.util.Random;

public class Assn1Prog4 {
    public static void main(String[] args){

        int totalPlayerWins = 0;
        int totalComputerWins = 0;
        int ties = 0;
        int playerValue = -1;

        //System.out.println("Please enter a 1 for rock, 2 for paper, or 3 for scissors.");

        Scanner keyboard = new Scanner(System.in);

        //for(int i = 0; i <= 5 ; i++){
        while(playerValue != 0)
        {

            System.out.println("1, 2, or 3?");

            playerValue = keyboard.nextInt();

            while(playerValue < 0 || playerValue > 3)
            {
                System.out.println("Sorry that is not a valid option.");
                System.out.println("Please enter a 1, 2, or 3");

                playerValue = keyboard.nextInt();
            }


            if(playerValue != 0)
            {
                Random rand = new Random();

                // nextInt is normally exclusive of the top value,
                // so add 1 to make it inclusive
                int computer = rand.nextInt(3)+1;

                if(playerValue == computer )
                {
                    ++ties;
                }
                else
                {
                    if(computer == 1 && playerValue == 2)
                    {
                        ++totalPlayerWins;
                    }
                    else if(computer == 1 && playerValue == 3)
                    {
                        ++totalComputerWins;
                    }
                    else if(computer == 2 && playerValue == 1)
                    {
                        ++totalComputerWins;
                    }
                    else if(computer == 2 && playerValue == 3)
                    {
                        ++totalPlayerWins;
                    }
                    else if(computer == 3 && playerValue == 1)
                    {
                        ++totalPlayerWins;
                    }
                    else
                    {
                        //computer equals 3 and playerValue equals 2
                        ++totalComputerWins;
                    }
                }
            }
        }

        System.out.println("Total player wins " + totalPlayerWins);
        System.out.println("Total computer wins " + totalComputerWins);
        System.out.println("Total ties " + ties);


    }
}