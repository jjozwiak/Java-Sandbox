import java.util.Scanner;

public class CarTest
{
    public static void main(String[] args)
    {      

        String make = "Oldsmobile";

        Car myCar = new Car(2012, make, 75);

        // myCar.setYearModel(2012);
        // myCar.setMake("Oldsmobile");
        // myCar.setSpeed(75);

        // myCar(2012, "Oldsmobile", 75);

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