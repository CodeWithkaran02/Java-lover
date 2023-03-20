import java.util.*;
class Homework9
{
	public static int checkValidity(int a ,int b,int c)
	{
		if(a+b<=c||a+c<=b||b+c<=b)
		   return 0;
		else
			return 1;
	}
		public static void main(String args [])
		{
			int a=3,b=4,c=5;
			if((checkValidity (a,b,c))==1)
			{
				System.out.println("Validet");
			}
			else 
			{
				System.out.println("Not Validet");
			}
		}
	
}