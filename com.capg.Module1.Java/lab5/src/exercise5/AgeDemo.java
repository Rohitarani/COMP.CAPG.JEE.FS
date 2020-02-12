package exercise5;
import java.util.Scanner;

public class AgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  
		  try {
		   if(age < 18) 
		    throw new ageException("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (ageException a) {
		   System.out.println(a);
		  }
		 }
	}


