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

            System.out.print("Guess a letter: ");

            String letter = keyboard.nextLine();

            if(letter.equals("A"))
            {
                game.hangMan.addBodyPart();

                //set game active to false if we reached 7 body parts
                if(game.hangMan.getBodyPartsAdded() == 7)
                {
                    game.setActive(false);
                }
            }

            // if(game.isValid(letter) && !game.hasBeenUsed(letter))
            // {
                //letter is valid and has not been used
                //loop through each letter of currentword

                //boolean found = false;

                //foreach
                    //if equals
                        //found = true;
                        //game.correctlyGuessedLetters.set(i) = letter;

                //if !found
                    //game.incorrectlyGuessedLetters.add(letter);
                    //add a body game.hangeMan.addBodyPart();

                //loop through correctlyGuessedLetters arraylist
                    //if there are no blank entries
                        //set game.active = false
                        //set game.gameWon = true
            // }
            // else
            // {
            //     //please choose a valid entry. 
            // }
        }

        
        game.displayGameBoard();
        System.out.println("You Lose!");
        //At this point the current game is over the player either won or loss
        //display message based on outcome.


    }
}