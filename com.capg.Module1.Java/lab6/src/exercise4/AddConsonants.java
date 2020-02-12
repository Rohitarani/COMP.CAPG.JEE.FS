package exercise4;

public class AddConsonants {

	public static void main(String[] args) {
		String c = "BCDFGHJKLMNPQRSTVWXYZ".toLowerCase();
		String inputString = "rohita";
		String retStr = "";
		inputString = inputString.toLowerCase();
		for(int i=0; i < inputString.length(); i++)
		{
		     char inputChar = inputString.charAt(i);
		     int indexOfCons = c.indexOf(inputChar);
		     if (indexOfCons != -1)
		     {
		           indexOfCons++;
				
		           if (indexOfCons == c.length())
		           {
		                indexOfCons = 0;
		           }
		           retStr += c.charAt(indexOfCons);
		     }
		     else
		     {
		           retStr += inputChar;
		     }
		}
		System.out.println(retStr);// TODO Auto-generated method stub

	}

}
