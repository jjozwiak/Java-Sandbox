import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {

        int store1, store2, store3, store4, store5;
        
        for(int i = 1; i <= 5; i++ )
        {
            System.out.println("Enter today's sales for store " + i + ":");
            Scanner keyboard = new Scanner(System.in);

            switch(i)
            {
                case 1:
                    store1 = keyboard.nextInt();
                    break;
                case 2:
                    store2 = keyboard.nextInt();
                    break;
                case 3:
                    store3 = keyboard.nextInt();
                    break;
                case 4: 
                    store4 = keyboard.nextInt();
                    break;
                case 5:
                    store5 = keyboard.nextInt();
                    break;
            }

        }

        for(int j = 1; j <= 5; j++)
        {
            System.out.print("Store " + j + ": ");

            switch(j)
            {
                case 1:
                    // for(int k = 1; k < store1; k++)
                    // {
                    //     System.out.print("*");
                    // }
                    // System.out.print("\n");
                    System.out.print(store1);
                    break;
                case 2:
                    // for(int k = 1; k < store2; k++)
                    // {
                    //     System.out.print("*");
                    // }
                    // System.out.print("\n");
                    System.out.print(store2);
                    break;
                case 3:
                    // for(int k = 1; k < store3; k++)
                    // {
                    //     System.out.print("*");
                    // }
                    // System.out.print("\n");
                    System.out.print(store3);
                    break;
                case 4: 
                    // for(int k = 1; k < store4; k++)
                    // {
                    //     System.out.print("*");
                    // }
                    // System.out.print("\n");
                    System.out.print(store4);
                    break;
                case 5:
                    // for(int k = 1; k < store5; k++)
                    // {
                    //     System.out.print("*");
                    // }
                    // System.out.print("\n");
                    System.out.print(store5);
                    break;
            }

        }    
    }
}