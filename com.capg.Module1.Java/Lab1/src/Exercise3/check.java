package Exercise3;

public class check {
	
	//boolean incNumber = false;
	//int previousDigit = 9;
	static boolean checknmbr(int n)
	{
		int previousDigit = 9;
        boolean increasingNumber = true;
        while (n > 0) 
        {
            int currentDigit = n % 10;
            n = n / 10;
            if (currentDigit > previousDigit) 
            {
                increasingNumber = false;
                break;
           }
            previousDigit = currentDigit;
        }
        return (increasingNumber);
	}
}
