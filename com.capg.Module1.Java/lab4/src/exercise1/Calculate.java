package exercise1;
import java.util.*;
import java.io.*;


public class Calculate {
	static int calculateSum(int number)
	{
		
	
		int n1=0,n2=0;
	    while(number!=0)
	    {
	    n1=number%10;
	    n2+=n1*n1*n1;
	    number/=10;
	    }
		return n2;
}
}

