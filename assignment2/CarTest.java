import java.util.Scanner;

public class CarTest
{
    public static void main(String[] args)
    {      

        String make = "Oldsmobile";

        Car myCar = new Car(1993, make);

        System.out.println("Year Model is: " + myCar.getYearModel());
        System.out.println("Make is: " + myCar.getMake());
        System.out.println("Speed is: " + myCar.getSpeed());

        for(int i = 1; i <= 5; ++i)
        {
            myCar.accelerate();

            System.out.println("Speed is " + myCar.getSpeed());
        }

        for(int i = 1; i <= 5; ++i)
        {
            myCar.brake();

            System.out.println("Speed is " + myCar.getSpeed());
        }
    }
}