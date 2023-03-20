 import java.util.*;
class Square 
 {
	 public static void main(String [] args )
	 {
		 int a[]=new a[10];
			System.out.println("Enetr a 10 number");
		 Scanner sc = new Scanner(System.in);
		 
		 for (int i=0; i<a.lenght; i++)
		 {
			 System.out.println("Enetr a number"+(i+1)+":");
			 a[i] =sc.nextInt();
		 }
		 
		System.out.println("Square of every no. is :");
		
		for (int x:a)
		{
			System.out.println("x*x");
		}
	 }
 }