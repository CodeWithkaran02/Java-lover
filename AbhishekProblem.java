/// Write a program to calculate the sum of following series where n is input by user. 
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
import java.util.*;
class AbhishekProblem 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int n;
		double sum = 0;
		System.out.println("Enter the series :");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum = 1/i;
		}
		System.out.println("sum:"+sum);
	}
}