import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
    	int x = 1;
        // while(x > 0)
        // {
        //     System.out.print("Enter a number: ");
        //     x = keyboard.nextInt();
        // }

        do
        {
            System.out.print("Enter a number: ");
            x = keyboard.nextInt();
        }
        while(x > 0);
    }
}