package exercise3;

import java.util.Scanner;
import java.util.function.Consumer;

import exercise1.lambexpress;

//port exercise1.lambexpress;

interface password
{
	static void credentials()
	{
		String user="abc";
		String pass="1";
	}
	
}
public class UserName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		String y=sc.nextLine();
		password pas=(String x, String y)->
		
	{
		if(x==user && y==pass)
			System.out.println("ok");
		else
			System.out.println("fail to connect");
			
	};
	password.credentials();
	
	
		
		
		//mbexpress fobj = (String x,String y)->System.out.println();// TODO Auto-generated method stub

	}

}
