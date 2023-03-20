import java.util.*;
import java.io.*;
class HackerRanck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i =0;i<t;i++);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		double s = a;
		for (int j = 1;j<=n ; j++)
		{
			s = s+(Math.pow(2,j-1)*b);
			System.out.print((int)s+" " );
			
		}
		System.out.println();
		
	}
	
}