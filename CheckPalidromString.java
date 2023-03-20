import java.util.*;
public class CheckPalidromString 
{
	public static void main(String args [])
	{
		String Orignal,reverse="";
		Scanner sc = new Scanner(System.in);
		Orignal = sc.nextLine();
		System.out.println("Enter the String:");
		 
		int length=Orignal.length();
		for(int i=length-1;i>0;i--)
		{
			reverse=reverse+Orignal.charAt(i);	
		}
		if(Orignal.equals(reverse))
		{
			System.out.println("It is a Palidrom");
		}
		else
		{
			System.out.println("It is not Palidrom");
		}
	}
}
