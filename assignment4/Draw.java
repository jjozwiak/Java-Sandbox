import java.util.ArrayList;

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
	private int bodyPartsAdded;

	public Draw()
	{
		head = false;
		body = false;
		leftArm = false;
		rightArm = false;
		pelvis = false;
		leftLeg = false;
		rightLeg = false;
		bodyPartsAdded = 0;
	}
	public void addBodyPart()
	{
		switch(bodyPartsAdded)
		{
			case 0:
				addHead();
				break;
			case 1:
				addBody();
				break;
			case 2:
				addLeftArm();
				break;
			case 3:
				addRightArm();
				break;
			case 4:
				addPelvis();
				break;
			case 5:
				addLeftLeg();
				break;
			case 6:
				addRightLeg();
		}
		bodyPartsAdded++;
	}
	public int getBodyPartsAdded()
	{
		return bodyPartsAdded;
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
	public void drawPlaceholder(ArrayList<Character> lettersGuessed, ArrayList<Character> incorrectGuessed)
	{
		

		System.out.print("Correctly guessed letters:  ");
		//print out the letters that were guessed correctly
		for(int i = 0; i < lettersGuessed.size(); i++)
		{
			System.out.print(" " + lettersGuessed.get(i) + "   ");
		}
		System.out.println();


		System.out.print("                            ");
		//print out the placeholder lines
		for(int j = 0; j < lettersGuessed.size(); j++)
		{
			System.out.print("---  ");
		}
		System.out.println();


		if(incorrectGuessed.size() > 0) {
			System.out.print("Incorrectly guessed letters: ");
		}

		//print out the placeholder lines
		for(int k = 0; k < incorrectGuessed.size(); k++)
		{
			if(k == 0)
			{
				System.out.print(incorrectGuessed.get(k));
			}else{
				System.out.print(", " + incorrectGuessed.get(k));
			}
		}

		System.out.println();
	}
	public void drawHangMan()
	{


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