package exercise3;

import java.util.Scanner;

public class reversearray {
	static int reverse1()
	{
		
	
	Scanner sc = new Scanner(System.in);
	 
    int i,j,n,temp = 0;

//System.out.println("Enter the number of elements:") ;
    n = sc.nextInt();
    int[] a = new int[n];
    int[] reverse = new int[n];

//System.out.println("Enter the elements") ;
    for(i=0;i<n;i++)
    { 
    	a[i] = sc.nextInt();
    }

    for(i=0;i<n;i++)
    {
    	reverse[i] = a[n-i-1];
    }
System.out.println("\nElements in reverse order are");
    for(i=0;i<n;i++)
    {
    	System.out.print(reverse[i]+" ") ;
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.println("\nElements sorted order are");
    for(i=0;i<n;i++)
    {
        System.out.println(a[i]+" ");
    }
	return temp;
}
}
