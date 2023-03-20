import java.util.Scanner;
class SumoftheNumber
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for (int i =1; i<=n;i++)
		{
			sum =(n*(n+1))/2;
			
		}
		System.out.println(sum);
		
	}
}