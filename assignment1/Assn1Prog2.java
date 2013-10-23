import java.util.Scanner;

public class Assn1Prog2 {
    public static void main(String[] args)
    {

        double distance;
        int menuItemSelected;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a distance in meters: ");

        distance = keyboard.nextDouble();

        while(distance < 0){
            System.out.println("Sorry, " + distance + " is not a valid value.");
            System.out.println("Please enter a number equal or greater than 0.");

            distance = keyboard.nextDouble();
        }

        menu();

        menuItemSelected = keyboard.nextInt();

        while(menuItemSelected < 1 || menuItemSelected > 4){
            System.out.println("Sorry " + menuItemSelected + " is not a valid menu option. Please select from one of the following:");
            menu();
            menuItemSelected = keyboard.nextInt();
        }

        while(menuItemSelected != 4){

            switch(menuItemSelected)
            {
                case 1:
                    showKilometers(distance);
                    break;
                case 2:
                    showInches(distance);
                    break;
                case 3:
                    showFeet(distance);
                    break;
            }

            menu();

            menuItemSelected = keyboard.nextInt();

            while(menuItemSelected < 1 || menuItemSelected > 4){
                System.out.println("Sorry " + menuItemSelected + " is not a valid menu option. Please select from one of the following:");
                menu();
                menuItemSelected = keyboard.nextInt();
            }

        }


    }

    public static void showKilometers(double meters)
    {
        double kilometers;
        kilometers = meters * 0.001;
        System.out.printf("\n%f meters is %f kilometers\n", meters, kilometers);
    }

    public static void showInches(double meters)
    {
        double inches;
        inches = meters * 39.37;
        System.out.printf("\n%f meters is %f inches\n", meters, inches);
    }

    public static void showFeet(double meters)
    {
        double feet;
        feet = meters * 3.281;
        System.out.printf("\n%f meters is %f feet\n", meters, feet);
    }

    public static void menu()
    {
        System.out.println();
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.println();
        System.out.println("Enter your choice:");
    }
}