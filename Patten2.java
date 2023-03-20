import java .util.*;
class Patten2
{
public static void main(String args [])
{
	int a = 4;
	int b = 5;
	
	for (int i =1;i<=4;i++)
	{
		for (int j = 1; j<=5; j++)
		{
			if(i==1 || j==1 || i==a || j==b)
			{
				System.out.print("*");
				
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}