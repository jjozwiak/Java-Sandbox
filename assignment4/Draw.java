public class Draw
{

	private boolean head;
	private boolean body;
	private boolean leftArm;
	private boolean rightArm;
	private boolean pelvis;
	private boolean leftLeg;
	private boolean rightLeg;
	private String outputString;

	public Draw()
	{
		head = false;
		body = false;
		leftArm = false;
		rightArm = false;
		pelvis = false;
		leftLeg = false;
		rightLeg = false;
	}

	public void addHead()
	{
		head = true;
	}
	public void addBody()
	{
		if(head == true)
		{
			body = true;
		}
	}
	public void addLeftArm()
	{
		if(body == true)
		{
			leftArm = true;
		}
	}
	public void addRightArm()
	{
		if(leftArm == true)
		{
			rightArm = true;
		}
	}
	public void addPelvis()
	{
		if(rightArm == true)
		{
			pelvis = true;
		}
	}
	public void addLeftLeg()
	{
		if(pelvis == true)
		{
			leftLeg = true;
		}
	}
	public void addRightLeg()
	{
		if(leftLeg == true)
		{
			rightLeg = true;
		}
	}

	public void drawHangMan()
	{
		// System.out.println("--------------                  ");
		// System.out.println("|            |                  ");
		// System.out.println("|           ---                 ");
		// System.out.println("|          |   |                ");
		// System.out.println("|           ---                 ");
		// System.out.println("|       -----|-----             ");
		// System.out.println("|            |                  ");
		// System.out.println("|            |                  ");
		// System.out.println("|          -----                ");
		// System.out.println("|          |   |                ");
		// System.out.println("|          |   |                ");
		// System.out.println("|          |   |                ");
		// System.out.println("|                               ");
		// System.out.println("--------------------------------");


		//Draw top of scaffold
		System.out.println("--------------                  ");
		System.out.println("|            |                  ");

		//Draw head section
		if(head == true)
		{

			System.out.println("|           ---                 ");
			System.out.println("|          |   |                ");
			System.out.println("|           ---                 ");
		}
		else
		{
			System.out.println("|                               ");
			System.out.println("|                               ");
			System.out.println("|                               ");
		}

		//Draw body and arm section
		if(body == true)
		{
			
			if(rightArm == true)
			{
				System.out.println("|       -----|-----             ");
				System.out.println("|            |                  ");
				System.out.println("|            |                  ");
			}
			else if(leftArm == true)
			{
				System.out.println("|       -----|                  ");
				System.out.println("|            |                  ");
				System.out.println("|            |                  ");
			}
			else
			{
				System.out.println("|            |                  ");
				System.out.println("|            |                  ");
				System.out.println("|            |                  ");
			}
		}
		else
		{
			System.out.println("|                               ");
			System.out.println("|                               ");
			System.out.println("|                               ");
		}

		//Draw pelvis
		if(pelvis == true)
		{
			System.out.println("|          -----                ");
		}
		else
		{
			System.out.println("|                               ");
		}

		//Draw legs section
		if(rightLeg == true)
		{
			System.out.println("|          |   |                ");
			System.out.println("|          |   |                ");
			System.out.println("|          |   |                ");
		}
		else if(leftLeg == true)
		{
			System.out.println("|          |                    ");
			System.out.println("|          |                    ");
			System.out.println("|          |                    ");
		}
		else
		{
			System.out.println("|                               ");
			System.out.println("|                               ");
			System.out.println("|                               ");
		}

		//Draw base of scaffold
		System.out.println("|                               ");
		System.out.println("--------------------------------");

	}
}