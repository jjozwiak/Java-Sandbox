public class Car
{

	private int yearModel;
	private String make;
	private int speed;

	public Car(int year, String makeArg, int speedArg)
	{
		yearModel = year;
		make = makeArg;
		speed = speedArg;
	}

	// public void setYearModel(int year)
	// {
	// 	yearModel = year;
	// }
	// public void setMake(String makeArg)
	// {
	// 	make = makeArg;
	// }
	// public void setSpeed(int speedArg)
	// {
	// 	speed = speedArg;
	// }
	public int getYearModel()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void accelerate()
	{
		speed += 5;
	}
	public void brake()
	{
		speed -= 5;
	}
}