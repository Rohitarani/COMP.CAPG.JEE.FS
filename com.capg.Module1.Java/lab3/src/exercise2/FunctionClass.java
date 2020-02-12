package exercise2;

import java.util.Arrays;

public class FunctionClass 
{
	public static void abc(String[] strArray)
	{
	
	Arrays.sort(strArray);
	//System.out.println(Arrays.toString(strArray));
	
		if(strArray.length%2==0)
		{
			       for (int i = 0; i < strArray.length/2; i++) {
			          	strArray[i]=strArray[i].toUpperCase();
	             		}	
		
            	  	for (int i =strArray.length/2+1; i < strArray.length; i++) 
                		{
	                 		strArray[i]=strArray[i].toLowerCase();
               	      	}	  
		}
		else
		{
			for (int i = 0; i < strArray.length/2+1; i++) {
	          	strArray[i]=strArray[i].toUpperCase();
         		}	

    	  	for (int i =strArray.length/2+2; i < strArray.length; i++) 
        		{
             		strArray[i]=strArray[i].toLowerCase();
       	      	}	
		}

System.out.println(Arrays.toString(strArray));
	}
}
