package exercise1;
interface lambexpress
{
	void abstractfun(int x,int y);
}
public class powerClass {

	public static void main(String[] args) {
		lambexpress fobj = (int x,int y)->System.out.println(Math.pow(x,y)); 
		  
        // This calls above lambda expression and prints 10. 
        fobj.abstractfun(5,3); // TODO Auto-generated method stub

	}

}
