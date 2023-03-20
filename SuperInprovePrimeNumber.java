import java.util.Scanner;
class SuperInprovePrimeNumber
{
	public static void main(String arghs [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag =1;
		for(int i =2;i*i<=n;i++)
		{
			if(n%i==0)
			flag=0;
		}
		if(flag==0)
		{
			System.out.println("Prime Number ");
		}
		else 
		{
			System.out.println(" Not Prime Number");
		}
	}
}