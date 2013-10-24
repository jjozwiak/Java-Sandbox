import java.util.Scanner;
import java.util.Random;

public class Assn1Prog4 {
    public static void main(String[] args){

        Random rand = new Random();

        boolean terminateProgram = false;

        int totalPlayerWins = 0;
        int totalComputerWins = 0;
        int ties = 0;
        int playerValue = 0;
        int computer = rand.nextInt(3)+1;
        int failedAttempts = 0;

        Scanner keyboard = new Scanner(System.in);

        menu();

        playerValue = keyboard.nextInt();

        while(playerValue < 1 || playerValue > 4)
        {
            System.out.println("Sorry that is an invalid entry. Please choose from one of the following:");
            menu();

            playerValue = keyboard.nextInt();

            ++failedAttempts;

            if(failedAttempts == 2)
            {
                terminateProgram = true;
                playerValue = 4;
            }
        }

        while(playerValue != 4)
        {

            failedAttempts = 0;

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
                    ++totalComputerWins;
                }
            }

            computer = rand.nextInt(3)+1;

            menu();

            playerValue = keyboard.nextInt();

            while(playerValue < 1 || playerValue > 4)
            {
                System.out.println("Sorry that is an invalid entry. Please choose from one of the following:");
                menu();

                playerValue = keyboard.nextInt();

                ++failedAttempts;

                if(failedAttempts == 2)
                {
                    terminateProgram = true;
                    playerValue = 4;
                }
            }
        }
        
        if(terminateProgram)
        {
            System.out.println("You have not entered a valid value. 1 for rock, 2 for paper or 3 for scissors are the values allowed.");
        }
        else
        {
            printResults(totalPlayerWins, totalComputerWins, ties);
        }


    }

    /**
     * Prints the menu options a user can choose from when the program is running
     * @return void
     */
    public static void menu()
    {
        System.out.println();
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Quit the game");
        System.out.println();
        System.out.println("Enter your choice:");
    }

    /**
     * Displays the aggregated results of all the games played.
     * @param  totalPlayerWins   The total number of games the user beat the computer.
     * @param  totalComputerWins The total number of games the computer beat the user.
     * @param  ties              The total number of games that the user and computer selected the same option.
     * @return                   void
     */
    public static void printResults(int totalPlayerWins, int totalComputerWins, int ties)
    {
        int totalGamesPlayedWithAWin = totalPlayerWins + totalComputerWins;
        double playersWinningPercentage = (double)totalPlayerWins/totalGamesPlayedWithAWin * 100;

        System.out.println("Total player wins " + totalPlayerWins);
        System.out.println("Total computer wins " + totalComputerWins);
        System.out.println("Total ties " + ties);
        System.out.printf("Winning percentage: %.2f%%\n", playersWinningPercentage);
    }
}