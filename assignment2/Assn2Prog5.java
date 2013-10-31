import java.util.Scanner;

public class Assn2Prog5
{
    public static void main(String[] args)
    {      
    	double mass = 0;
    	double velocity = 0;
    	double totalKineticEnergy = 0;

    	Scanner keyboard = new Scanner(System.in);

    	System.out.print("Please enter the object's mass: ");
    	mass = keyboard.nextDouble();

    	System.out.print("Please enter the object's velocity: ");
    	velocity = keyboard.nextDouble();

    	totalKineticEnergy = kineticEnergy(mass, velocity);

    	System.out.println("The total kinetic energy is " + totalKineticEnergy);
    }
    public static double kineticEnergy(double mass, double velocity)
    {
        double velocitySquared = velocity * velocity;
    	return (mass * velocitySquared)/2;
    }
}