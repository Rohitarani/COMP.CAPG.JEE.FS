package exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Smallestnumber {

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-2);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		Collections.sort(arr);
		System.out.println(arr.get(1));// TODO Auto-generated method stub
		
		
	}

}
