import java.util.Scanner;
import java.util.ArrayList;

public class PlayerDemo
{
    public static void main(String[] args)
    {

        //start a new game instance (game instance creates a new draw instance)
        Game game = new Game();

        Scanner keyboard = new Scanner(System.in);

        while(game.getActive())
        {
            game.displayGameBoard();
            System.out.print("Current word: " + game.getCurrentWord() + "\n");

            System.out.print("Guess a letter: ");

            String letter = keyboard.nextLine();

            //convert to char
            char charLetter = letter.charAt(0);

            boolean valid = game.isValid(charLetter);
            
            while(!valid){

                game.invalidEntries++;

                System.out.print("Sorry your entry was not a letter. Please enter a letter: ");

                letter = keyboard.nextLine();

                charLetter = letter.charAt(0);

                valid = game.isValid(charLetter);

                if(game.invalidEntries == 2)
                {
                    System.out.println("You have entered an invalid entry more than 3 times. The program is ending.");
                    System.exit(0);
                }
            }


            if(game.hasBeenUsed(game.incorrectlyGuessedLetters, game.correctlyGuessedLetters, charLetter))
            {
                game.hangMan.addBodyPart();
                System.out.println("damn!");
                //set game active to false if we reached 7 body parts
                if(game.hangMan.getBodyPartsAdded() == 7)
                {
                    game.setActive(false);
                }
            }
            else {

                if(!game.isLetterInWord(game.getCurrentWord(), charLetter, game.correctlyGuessedLetters, game.incorrectlyGuessedLetters))
                {
                    game.hangMan.addBodyPart();

                    //set game active to false if we reached 7 body parts
                    if(game.hangMan.getBodyPartsAdded() == 7)
                    {
                        game.setActive(false);
                    }
                }
            }

        }


        game.displayGameBoard();
        System.out.println("You Lose!");
        //At this point the current game is over the player either won or loss
        //display message based on outcome. 


    }
}