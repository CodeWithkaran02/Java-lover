import java.util.*;
class StringBuldirProblem7
{
	public static void main(String ags [])
	{
		StringBuilder  s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("World Java");
		StringBuilder s = s1.append(s2);
		System.out.println(s.toString());	
	}
}