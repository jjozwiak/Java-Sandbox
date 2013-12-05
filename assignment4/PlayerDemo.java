import java.util.Scanner;
import java.util.ArrayList;

public class PlayerDemo
{
    public static void main(String[] args)
    {

        //start a new game instance (game instance creates a new draw instance)
        Game game = new Game();

        //TODO: start a new player score instance

        Scanner keyboard = new Scanner(System.in);

        while(game.getActive())
        {
            game.displayGameBoard();
            System.out.print("Current word: " + game.getCurrentWord() + "\n");

            System.out.print("Guess a letter: ");

            String letter = keyboard.nextLine();

            //convert to char
            char charLetter = letter.charAt(0);


            if(!game.isLetterInWord(game.getCurrentWord(), charLetter, game.correctlyGuessedLetters, game.incorrectlyGuessedLetters))
            {
                game.hangMan.addBodyPart();

                //set game active to false if we reached 7 body parts
                if(game.hangMan.getBodyPartsAdded() == 7)
                {
                    game.setActive(false);
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

           // System.out.println(game.hasBeenUsed(game.incorrectlyGuessedLetters, game.correctlyGuessedLetters, charLetter));

        }


        game.displayGameBoard();
        System.out.println("You Lose!");
        //At this point the current game is over the player either won or loss
        //display message based on outcome. 


    }
}