import java.util.*;
class StringProblem9
{
	public static void main(String ags [])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder n = new StringBuilder(s);
		
		for(int i = n.length()-1;i>=0;i--)
		{
			System.out.print(n.charAt(i));
		}
	}
}