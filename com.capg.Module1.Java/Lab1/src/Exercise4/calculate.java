package Exercise4;

public class calculate {
	static int powerOfTwo(int n) 
	{ 
	    if(n == 0) 
	        return 0; 
	    while(n != 1) 
	    {  
	        if(n % 2 != 0) 
	            return 0; 
	        n = n / 2;  
	    } 
	    return 1; 
	} 
}
