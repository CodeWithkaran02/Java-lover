import java.util.*;
class fabinoicSeris
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum,fact=0;
		
		for (int i =1;i<=10;i++)
		{
			sum=fact*i;
			System.out.println(sum);
		}
	}
}