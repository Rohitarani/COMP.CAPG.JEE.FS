package Exercise6;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassVote {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();// TODO Auto-generated method stub
		result.put(102,18); 
		result.put(103,45);
		result.put(104,2);
		ArrayList<Integer> hm=new ArrayList<Integer>();
		for(Integer i:result.keySet())
		{
			if(result.get(i)>=18)
			{
				hm.add(i);
				
			}
			
		}
		System.out.println(hm);
	}// TODO Auto-generated method stub note

}


