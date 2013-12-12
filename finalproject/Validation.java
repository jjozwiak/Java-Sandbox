/*
 * Variables
 * Conditionals
 * User-defined methods
 * Method argument passing
 * Value-returning methods
 * User-defined class
 */

import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;  
import java.net.URISyntaxException;  

public class Validation {

	public static boolean isValidUrl(String urlArg)
	{
		URL u = null;  
        try {  
            u = new URL(urlArg);  
        } catch (MalformedURLException e) {  
            return false;  
        }  
        try {  
            u.toURI();  
        } catch (URISyntaxException e) {  
            return false;  
        }  
        return true;
	}

	public boolean isYesOrNo(char value)
	{
        if(value != 'Y' && value != 'N')
        {
            return false;
        }
        else
        {
            return true;
        }
	}
}