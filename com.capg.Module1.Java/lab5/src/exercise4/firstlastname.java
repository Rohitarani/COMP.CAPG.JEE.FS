package exercise4;

import java.util.Scanner;

//import exercise5.ageException;

public class firstlastname {

	public void check()
	{
		try
		{
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	   
	    String firstname = sc.nextLine(); 
	    String lastname = sc.nextLine();
	    if(firstname.equals("") || lastname.equals(""))
	    {
	    throw new NameException(lastname); 
	    }  
	    else
	    {
	    	System.out.print("ok");
	    }
		}	
		 catch (NameException ex) 
	    { 
	        System.out.println("Exception Caught"); 

	        // Print the message from MyException object 
	        System.out.println(ex.getMessage()); 
	    } 	
	}

}

