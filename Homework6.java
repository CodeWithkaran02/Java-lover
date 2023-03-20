import java.util.*;
class Homework6
{
	public static void main(String args [])
	{
		int a,b,c,largest,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Number");
		a =sc.nextInt();
		System.out.println("Enter a Second Number");
	    b = sc.nextInt();
	    System.out.println("Enter a Third Number");
		c= sc.nextInt();
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		System.out.println("The Largest num:"+largest);
		
	}
}