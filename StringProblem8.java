import java.util.*;
class StringProblem8
{
	public static void main(String ags[])
	{
		String s = "JAVACODING";
		for(int i =0;i<s.length();i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
			
	}
}