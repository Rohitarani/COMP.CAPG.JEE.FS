package exercise2;

public class Fibbocal 
{
	public static int fibrec(int n)
    {
		if(n==1)
			return (1);
		else if(n==2)
			return (1);
		else
			return (fibrec(n-1)+fibrec(n-2));
         
    }
	public static int fibonacci(int n1)
	{
		if(n1<=2)
			return 1;
		int i, last, nextToLast, result;
		last = 1;
		nextToLast = 1;
		result = 0;
		for(i=0; i<=n1-3; i++){
			result = last + nextToLast;
			nextToLast = last;
			last = result;
		}
		return result;
	}
}
