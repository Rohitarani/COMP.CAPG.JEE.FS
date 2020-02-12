package Exercise4;

import java.util.HashMap;

public class HashStudents {

	public static void main(String[] args) {
		HashMap<String,Integer> result=new HashMap<String,Integer>();// TODO Auto-generated method stub
		result.put("rohita",90); 
		result.put("sahil",85);
		result.put("rahul",75);
		HashMap<String,String> hm=new HashMap<String,String>();
		for(String i:result.keySet())
		{
			if(result.get(i)>=90)
			{
				hm.put(i,"gold");
				
			}
			else if(result.get(i)>=80 && result.get(i)<90)
			{
				hm.put(i, "Silver");
			}
			else if(result.get(i)>=70 && result.get(i)<80)
			{
				hm.put(i, "Bronze");
			}
		}
		System.out.println(hm);
	}

}
