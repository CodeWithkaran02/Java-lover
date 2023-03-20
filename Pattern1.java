import java.util.*;
class Pattern1
{
	public static void main(String ags [])
	{
		int n =9;
		for(int i =1; i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				System.out.print(((i+j)%2));
			}
			System.out.println();
		}
	}
}