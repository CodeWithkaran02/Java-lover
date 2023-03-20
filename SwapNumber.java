import java.util.Scanner;
class SwapNumber 
{
	public static void main(String args [])
	{
		int x ;
		int y;
		int temp;
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println("Before Swapping " x="+x+" y =+y);
		
		temp =x;
		x=y;
		y=temp;
		System.out.println("After Swappinf "x="+x+ "\n y="+y);
	}
}