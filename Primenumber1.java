import java.util.*;
class Primenumber1
{
	public static void main(String ags [])
	{
		int n ;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Emter the number");
		n =sc.nextInt();
		for (int i =1; i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count ==2)
		{
			System.out.println(n+"Prime number ");
		}
		else
		{
			System.out.println(n+"Not Prime number ");
		}
	}
}