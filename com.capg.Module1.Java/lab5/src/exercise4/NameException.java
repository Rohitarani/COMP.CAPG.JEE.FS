package exercise4;

public class NameException extends Exception
{
	NameException (String s){  
		  super(s);  
		 }  
	public static void main(String[] args) 
	{
		firstlastname ab=new firstlastname();
		ab.check();
	}
}
