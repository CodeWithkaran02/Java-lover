import java.util.*;
public class DigitofANumber 
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		String s=Integer.toString(n);
		for(i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		sc.close();
	}
}