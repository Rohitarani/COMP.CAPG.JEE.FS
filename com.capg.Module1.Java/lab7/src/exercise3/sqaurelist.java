package exercise3;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

public class sqaurelist {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-2);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		//System.out.println(arr);
		HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();
		for (Integer digit : arr) 
		{
	        result.put(digit,digit * digit);
	    }
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
