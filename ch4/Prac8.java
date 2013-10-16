import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure;
    	int x = 1;
        
        System.out.print("Are you sure you want to quit?");
        input = keyboard.next();
        sure = input.charAt(0);

        while(sure != 'Y' && sure != 'N')
        {
            System.out.print("Are you sure you want to quit?");
            input = keyboard.next();
            sure = input.charAt(0);
        }
    }
}