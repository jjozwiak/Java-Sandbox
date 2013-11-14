import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class PhoneBookEntry
{
	String name;
	String phonenumber;

	public PhoneBookEntry(String nameArg, String phoneNumberArg)
	{
		name = nameArg;
		phonenumber = phoneNumberArg;
	}
	public void setName(String nameArg)
	{
		name = nameArg;
	}
	public void setPhoneNumber(String phoneNumberArg)
	{
		phonenumber = phoneNumberArg;
	}
	public String getName()
	{
		return name;
	}
	public String getPhoneNumber()
	{
		return phonenumber;
	}

}

public class PhoneBook
{
    public static void main(String[] args) throws IOException
    {

    	int entryCount = 5;
        int currentEntry = 0;
        int incorrectEntryCount = 0;

        //Create an aray list to hold objects we are currently working with
    	ArrayList<PhoneBookEntry> phonebookEntries = new ArrayList<PhoneBookEntry>();
        Scanner keyboard =  new Scanner(System.in);


        //check if file exists if not create it.

        if(getNumberOfEntriesFromFile() > 0)
        {
            System.out.print("Would you like to use your answers from the previous round? 'yes' or 'no':");

            String loadAnswers = keyboard.nextLine();

            if(loadAnswers.equals("yes"))
            {

                entryCount = entryCount - getNumberOfEntriesFromFile();

            }
            else
            {
                clearEntriesFile();
            }

        }


    	for(int i = 0; i < entryCount; i++){
    		
    		String name;
    		String phonenumber;

    		System.out.print("Enter a name: ");
    		name = keyboard.nextLine();

    		//validate name
    		while(!name.matches("[a-zA-Z]+")){
                incorrectEntryCount++;

                if(incorrectEntryCount > 2)
                {
                    System.out.println("Sorry you entered an invalid option too many times. The program is now exiting.");

                    System.out.print("enter 'yes' if you would like to save your answers: ");

                    String save = keyboard.nextLine();

                    if(save.equals("yes"))
                    {
                        System.out.println("Entries were saved to file.");
                        
                        writeEntriesToFile(phonebookEntries);
                    }
                    else
                    {
                        System.out.println("Entries discarded.");

                        clearEntriesFile();
                    }

                    System.exit(0);
                }

                System.out.println("Sorry that's not a valid entry. Your entry must only contain letters.");
                System.out.print("Please enter name again: ");

                name = keyboard.nextLine();
            }
            //if we get here let's reset this to 0.
            incorrectEntryCount = 0;

    		System.out.print("Enter a number: ");
    		//keyboard.nextLine();
    		phonenumber = keyboard.nextLine();

    		//consume line
    		//keyboard.nextLine();

    		
            //validate number
            while(phonenumber.length() < 10 || !phonenumber.matches("[0-9]+")){
                incorrectEntryCount++;

                if(incorrectEntryCount > 2)
                {
                    System.out.println("Sorry you entered an invalid option too many times. The program is now exiting.");

                    System.out.print("enter 'yes' if you would like to save your answers: ");

                    String save = keyboard.nextLine();

                    if(save.equals("yes"))
                    {
                        System.out.println("Entries were saved to file.");
                        
                        writeEntriesToFile(phonebookEntries);
                    }
                    else
                    {
                        System.out.println("Entries discarded.");

                        clearEntriesFile();
                    }

                    System.exit(0);
                }

                System.out.println("Sorry that's not a valid entry. Your entry must only contain numbers and be 10 digits long.");
                System.out.print("Please enter phone number again: ");

                phonenumber = keyboard.nextLine();
            }
            //if we get here let's reset this to 0.
            incorrectEntryCount = 0;


    		//create new phonebook entry instance
    		PhoneBookEntry newEntry = new PhoneBookEntry(name, phonenumber);

    		//add it to the array list
    		phonebookEntries.add(newEntry);

    	}

        System.out.println("Below are the phone book contacts you have entered are: ");

        //print the entries from the file first
        printEntriesFromFile();

        //now loop through the array list and print out the remaining entries
        for(int i = 0; i < phonebookEntries.size(); i++)
        {
            System.out.println(phonebookEntries.get(i).getName() + " - " + phonebookEntries.get(i).getPhoneNumber());
        }


        //clear the file for the next user.
        clearEntriesFile();








    }
    public static void printEntriesFromFile() throws IOException
    {
        File entriesFile = new File("phonebook.txt");
        Scanner inputFile = new Scanner(entriesFile);
        int numberOfEntries = 0;
        while(inputFile.hasNext())
        {
            // userAnswers[numberOfEntries] = inputFile.nextLine();
            // numberOfEntries++;
            System.out.println(inputFile.nextLine());
        }

        inputFile.close();

    }
    public static int getNumberOfEntriesFromFile() throws IOException
    {
        File entriesFile = new File("phonebook.txt");
        Scanner inputFile = new Scanner(entriesFile);
        int numberOfEntries = 0;
        while(inputFile.hasNext())
        {
            inputFile.nextLine();
            numberOfEntries++;
        }

        inputFile.close();

        return numberOfEntries;
    }
    public static void writeEntriesToFile(ArrayList<PhoneBookEntry> entries) throws IOException
    {
        PrintWriter outputFile = new PrintWriter("phonebook.txt");

        for(int i = 0; i < entries.size(); i++)
        {
            PhoneBookEntry currentEntry = entries.get(i);
            outputFile.println(currentEntry.getName() + " - " + currentEntry.getPhoneNumber());
        }

        outputFile.close();
    }
    public static void clearEntriesFile() throws IOException
    {
        PrintWriter outputFile = new  PrintWriter("phonebook.txt");
        outputFile.close();
    }
}