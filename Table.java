import java.util.*;
class Table
{
	public static void main(String args [])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		//sc.nextInt();
		System.out.println("Enter the Table:");
		num =sc.nextInt();

		for( int i =1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
	}
	
}
