public class ConstructorTest
{

	public int yearModel;
	public int make;
	public int speed;

	public ConstructorTest(int... sum)
	{

		for(int i = 0; i < sum.length; i++)
		{
			if(i == 0)
			{
				yearModel = sum[0];
			}
			if(i == 1)
			{
				make = sum[1];
			}
		}
	}

}