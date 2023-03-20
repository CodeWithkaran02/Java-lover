import java.util.Scanner;
public class oddEven 
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		int rem = num%2;
		if(rem==1)
		{
			System.out.println("Number id Odd:");
		}
		else 
		{
			System.out.println("Number is Even:");
		}
	}
}
