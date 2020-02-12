package exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedClass {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-2);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		Collections.reverse(arr);
		Collections.sort(arr);
		System.out.println(arr);
	}

}
