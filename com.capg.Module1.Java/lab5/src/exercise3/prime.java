package exercise3;
import java.util.Scanner;

public class prime {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		static int primeno()
		{
		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("");
		n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		int i = 0;
		return i;
	}
	}


