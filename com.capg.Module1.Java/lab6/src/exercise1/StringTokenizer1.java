package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizer1 
{
	static int token1() throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("\nEnter A Line Of Integers:");
   
    String line = br.readLine();
    StringTokenizer st = new StringTokenizer(line);
    System.out.println("\nNumber of tokens : "+st.countTokens());
    long sum = 0;
    System.out.print("\nTokens are : \n" );
    while (st.hasMoreTokens())
    {
        long i = Long.parseLong(st.nextToken());
        System.out.print(i + "\n");
        sum = sum + i;
    }
    System.out.println("\nThe Sum Is :" +sum);
	return 0;
}
}
