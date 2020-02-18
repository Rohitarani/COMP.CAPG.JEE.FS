package Exercise2;
interface function
{
	public String space(String a, String b);
}
public class SpacesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function s = (str1, str2) -> System.out.println(str1+" "+str2);
		s.space("g","s");
	}

}
