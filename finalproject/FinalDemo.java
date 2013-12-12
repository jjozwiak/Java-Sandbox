/*
 * Variables
 * Conditionals
 * Iterations
 * ArrayList
 */

import java.util.ArrayList;
import java.util.Scanner;
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
            System.out.print("Would you like to enter another url? Type Y or N: ");

            String addAnotherUrl = keyboard.nextLine();
            char c = addAnotherUrl.charAt(0);

            valid = validate.isYesOrNo(c);

            while(!valid){
                System.out.print("Sorry that was not valid. Please enter a Y or N: ");
                addAnotherUrl = keyboard.nextLine();
                c = addAnotherUrl.charAt(0);
                valid = validate.isYesOrNo(c);
            }

            if(addAnotherUrl.equals("N"))
            {
                anotherUrl = false;
            }
        }

        //Get the image files to search for in each url
        while(anotherImageFile == true)
        {
            System.out.print("Please enter a filename you'd like to search for: ");

            String currentImage = keyboard.nextLine();

            imageFilesToSearchFor.add(currentImage);

            System.out.print("Would you like to enter another file name? Type Y or N: ");

            String addAnotherFile = keyboard.nextLine();
            Validation validation = new Validation();

            char e = addAnotherFile.charAt(0);

            boolean valid = validation.isYesOrNo(e);

            while(!valid){
                System.out.print("Sorry that was not valid. Please enter a Y or N: ");
                addAnotherFile = keyboard.nextLine();
                e = addAnotherFile.charAt(0);
                valid = validation.isYesOrNo(e);
            }

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

        System.out.println("Enter 1 for full results (missing AND found files)");
        System.out.println("Enter 2 for ONLY missing files");
        System.out.print("Enter 3 for ONLY found files ");

        int option = keyboard.nextInt();

        System.out.println();

        switch(option){
            case 1:
                results.printResults(results.imageFilesFound, results.imageFilesNotFound);
                break;
            case 2:
                results.printResults(results.imageFilesNotFound, 1);
                break;
            case 3:
                results.printResults(results.imageFilesFound, 2);
                break;
        }

    }
}