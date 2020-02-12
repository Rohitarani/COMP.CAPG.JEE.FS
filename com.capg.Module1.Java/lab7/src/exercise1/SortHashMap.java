package exercise1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SortHashMap {

	public static void main(String[] args)
	{
HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        
        //put values
        hMap.put("Three", 3);
        hMap.put("Two", 2);
        hMap.put("Four", 4);
        hMap.put("One", 1);
        hMap.put("Five", 5);
        
        //get all the values from the HashMap
        ArrayList<Integer> list = new ArrayList<Integer>( hMap.values() );
        
        /*
         * Use sort method of Collections to sort the List and
         * provide custom Comparator to compare values.
         */
        
        Collections.sort(list, new Comparator<Integer>(){
 
            public int compare(Integer i1, Integer i2) {
                return i1.compareTo(i2);
            }            
            
        });
        
        //print the sorted values List
        System.out.println("Sorted Values");
        for(Integer value : list)
            System.out.println(value);// TODO Auto-generated method stub 

	}

}
