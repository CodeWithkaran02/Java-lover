import java.util.Scanner;
class Factorail
{
	public static void main(String args )
	{
		int n, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		n= sc.nextInt();
		
		for (int i=1; i<=n;i++)
		{
			fact =fact*i;
			
		}
		System.out.println("factorial "+n+ "is "+ fact);
	}
} 