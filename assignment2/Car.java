public class Car
{

	private int yearModel;
	private String make;
	private int speed;

	public Car(int year, String makeArg)
	{
		yearModel = year;
		make = makeArg;
		speed = 0;
	}

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