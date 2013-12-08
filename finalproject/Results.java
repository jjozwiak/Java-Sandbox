import java.util.ArrayList;

public class Results {

	private int numberOfFilesFound;
	private int numberOfFilesNotFound;
	public ArrayList<String> imageFilesFound;
    public ArrayList<String> imageFilesNotFound;

	public Results()
	{
		numberOfFilesFound = 0;
		numberOfFilesNotFound = 0;
		imageFilesFound = new ArrayList<String>();
		imageFilesNotFound = new ArrayList<String>();
	}

	public int getNumOfFilesFound()
	{
		return numberOfFilesFound;
	}

	public int getNumOfFilesNotFound()
	{
		return numberOfFilesNotFound;
	}

	public void incrementNumFilesFound()
	{
		numberOfFilesFound++;
	}

	public void incrementNumFilesNotFound()
	{
		numberOfFilesNotFound++;
	}

	public void printFilesFound()
	{

	}

	public void printFilesNotFound()
	{

	}

	public void addToImageFilesFound(String fileFound) {
		imageFilesFound.add(fileFound);
	}

	public void addToImageFilesNotFound(String fileNotFound) {
		imageFilesNotFound.add(fileNotFound);
	}


	public void compare(ArrayList<String> imageFilesToSearchFor, ArrayList<String> imageFilesFromUrl)
	{

        //Now let's compare imageFilesFromUrl list to our imageFilesToSearchFor
        for(int i=0; i < imageFilesToSearchFor.size(); i++)
        {
            boolean found = false;

            for(int j=0; j < imageFilesFromUrl.size(); j++)
            {
                String urlFile = imageFilesFromUrl.get(j);
                String searchFile = imageFilesToSearchFor.get(i);

                if(searchFile.equals(urlFile))
                {
                    found = true;
                }
            }

            if(found)
            {
                addToImageFilesFound(imageFilesToSearchFor.get(i));
                incrementNumFilesFound();
            }
            else
            {
                addToImageFilesNotFound(imageFilesToSearchFor.get(i));
                incrementNumFilesNotFound();
            }
        }

	}


	//overloaded method
	public void printResults() {
		System.out.println(getNumOfFilesFound() + " Files Found:");
        for(int i = 0; i < imageFilesFound.size(); i++)
        {
            System.out.println(imageFilesFound.get(i));
        }

        System.out.println(getNumOfFilesNotFound() + " Files Not Found:");
        for(int i = 0; i < imageFilesNotFound.size(); i++)
        {
            System.out.println(imageFilesNotFound.get(i));
        }
	}

	public void printResults(int num) {

	}

}