import java.util.Scanner;
class OrOprator
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n>0||n<10)
		{
			System.out.println("True");
			
		}
		else 
		{
			System.out.println("False");
		}
			
	}
}