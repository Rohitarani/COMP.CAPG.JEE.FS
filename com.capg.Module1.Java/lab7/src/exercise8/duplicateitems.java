package exercise8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class duplicateitems {

	public static void main(String[] args) {
		
        // creating List from array
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-2);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		arr.add(6);
		arr.add(-2);
		arr.add(6);
		arr.add(3);
		arr.add(6);
        Set<Integer> set = new LinkedHashSet<Integer>(arr);
        arr.clear();
        arr.addAll(set);
        //System.out.println(arr);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }// TODO Auto-generated method stub

	}


