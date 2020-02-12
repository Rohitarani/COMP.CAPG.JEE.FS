package exercise2;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		character("rohita");
		     }
		 static void character(String inputString)
		    {
			 HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		    char[] charArray = toCharArray();
		    for (char c : charArray)
		        {
		            if(countMap.containsKey(c))
		            {
		                countMap.put(c, countMap.get(c)+1);
		            }
		            else
		            {
		            	countMap.put(c, 1);
		            }
		  
		          }
		    System.out.println(countMap);        
	}
		private static char[] toCharArray() {
			// TODO Auto-generated method stub
			return null;
		}

}
