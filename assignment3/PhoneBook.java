import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class PhoneBookEntry
{
	String name;
	int phonenumber;

	public PhoneBookEntry(String nameArg, int phoneNumberArg)
	{
		name = nameArg;
		phonenumber = phoneNumberArg;
	}
}

public class PhoneBook
{
    public static void main(String[] args) throws IOException
    {

    	int entryCount = 5;
    	ArrayList<PhoneBookEntry> phonebookEntries = new ArrayList<PhoneBookEntry>();


    	Scanner keyboard =  new Scanner(System.in);

    	for(int i = 0; i < entryCount; i++){
    		
    		String name;
    		int phonenumber;

    		System.out.print("Enter a name: ");
    		name = keyboard.nextLine();

    		//validate 
    		//
    		//consume line
    		//keyboard.nextLine();

    		System.out.print("Enter a number: ");
    		//keyboard.nextLine();
    		phonenumber = keyboard.nextInt();

    		//consume line
    		keyboard.nextLine();

    		//validate number

    		//create new phonebook entry instance
    		PhoneBookEntry newEntry = new PhoneBookEntry(name, phonenumber);

    		//add it to the array list
    		phonebookEntries.add(newEntry);

    	}

    	PhoneBookEntry entry1 = new PhoneBookEntry("Jason", 1231231234);

    	System.out.println(entry1.name);
    	System.out.println(entry1.phonenumber);
    }
}