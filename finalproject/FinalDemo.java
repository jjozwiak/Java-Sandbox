import java.util.ArrayList;
import java.util.Scanner;
// import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Example program to list links from a URL.
 */
public class FinalDemo {
    public static void main(String[] args) throws IOException {

        boolean anotherUrl = true;
        boolean anotherImageFile = true;
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> urlsToScrape = new ArrayList<String>();
        ArrayList<String> imageFilesToSearchFor = new ArrayList<String>();
        ArrayList<String> imageFilesFromUrl = new ArrayList<String>();

        //Create the results object this is where we will hold which files we found
        Results results = new Results();

        //Get the urls to search
        while(anotherUrl == true)
        {
            System.out.print("Please enter a url to search. Be sure to enter the full url with protocol. (Example http://example.com):");

            String currentUrl = keyboard.nextLine();

            Validation validate = new Validation();
            //validate url
            boolean valid = validate.isValidUrl(currentUrl);

            while(!valid)
            {
                System.out.print("Sorry please enter a valid url: ");
                currentUrl = keyboard.nextLine();
                valid = validate.isValidUrl(currentUrl);
            }

            urlsToScrape.add(currentUrl);

            //Does user want to add another url?
            System.out.println("Would you like to enter another url? Type Y or N");

            String addAnotherUrl = keyboard.nextLine();

            if(addAnotherUrl.equals("N"))
            {
                anotherUrl = false;
            }
        }

        //Get the image files to search for in each url
        while(anotherImageFile == true)
        {
            System.out.print("Please enter a filename you'd like to search for:");

            String currentImage = keyboard.nextLine();

            imageFilesToSearchFor.add(currentImage);

            System.out.println("Would you like to enter another file name? Type Y or N");

            String addAnotherFile = keyboard.nextLine();

            if(addAnotherFile.equals("N"))
            {
                anotherImageFile = false;
            }
        }

        //Loop through each url and add the image files found to our imageFilesFromUrl arraylist
        for(int i = 0; i < urlsToScrape.size(); i++)
        {
            //create a webpage object
            WebPage currentPage = new WebPage(urlsToScrape.get(i));

            //add each image file to the files from pages list
            currentPage.addToImagesList(imageFilesFromUrl);
        }

        results.compare(imageFilesToSearchFor, imageFilesFromUrl);

        results.printResults();


    }
}