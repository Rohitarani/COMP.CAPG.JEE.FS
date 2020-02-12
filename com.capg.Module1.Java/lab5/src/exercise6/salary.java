package exercise6;

import java.util.Scanner;

//import exercise5.ageException;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur saalry :: ");
		  int salary = s.nextInt();
		  
		  try {
		   if(salary < 3000) 
		    throw new EmployeeException("Invalid salary");
		   else
		    System.out.println("Valid saalry");
		  }
		  catch (EmployeeException a) {
		   System.out.println(a);
		  }
		 
	}

}
