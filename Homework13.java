import java.util.*;
class Homework13
{
	public static void main(String args [])
	{
		String orignal,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String / if the Palidrom or not ");
		orignal = sc.nextLine();
		int length = orignal.length();
		for(int i =length-1;i>=0;i--)
		reverse=reverse+orignal.charAt(i);
		if(orignal.equals(reverse))
		{
			System.out.println("Predrome:");
			
		}
		else
		{
			System.out.println("Not Predrome:");
		}
		
	}
}