package Exercise4;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate cal=new calculate();
		int test_no = 1023; 
        if(cal.powerOfTwo(test_no) == 1) 
         System.out.println(test_no +  
                           " is a power of 2"); 
        else
         System.out.println(test_no +  
                           "is not a power of 2");
	}

}
