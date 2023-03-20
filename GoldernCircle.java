import java.util.*;
class GoldernCircle
{
	public static void main(String arga [])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int first =0; Second =1;
		int i = 1;
		while (i<=n)
		{
			int third = first + Second ;
			System.out.println(first);
			first = Second;
			Second = third;
			i++;
		}
	}
} 