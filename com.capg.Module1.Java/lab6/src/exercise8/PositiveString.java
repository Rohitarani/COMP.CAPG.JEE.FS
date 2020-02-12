package exercise8;

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int f=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			{
				f=0;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
		sc.close();
	}

}
