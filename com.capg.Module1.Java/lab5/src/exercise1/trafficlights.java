package exercise1;

import java.util.Scanner;

public class trafficlights 
{
	public static void main(String args[]) throws java.io.IOException 
	{
		char choice;
		do {
			 System.out.println("choose option ");
			 System.out.println(" 1. red");
			 System.out.println(" 2. yellow");
			 System.out.println(" 3. green");
			 choice = (char) System.in.read();
			}
		while( choice < '1' || choice > '5');
		switch(choice)
		{
		case '1':
			System.out.println("stop");
			break;
		case '2':
			System.out.println("ready");
			break;
		case '3':
			System.out.println("go");
			break;
		}
		
	}
}


