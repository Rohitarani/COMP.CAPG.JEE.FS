package exercise5;

import java.util.Scanner;

public class ModifyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.print("\nEnter Number ");
	     int a=sc.nextInt();
	 String s=String.valueOf(a);
	  
	 StringBuffer buffer = new StringBuffer();
	 for(int i=0;i<s.length()-1;i++)
	 {
		 int p=Math.abs(s.charAt(i)-s.charAt(i+1));
		 buffer.append(p);
	 }
	 
	 buffer.append(s.charAt(s.length()-1));
	 System.out.println(buffer);
	      sc.close();
	}

}
