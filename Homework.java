import java.util.*;
//import java.Scanner.*;
class Homework
 {
	 public static void main(String args [])
	 {
		 Scanner sc =new Scanner (System.in);
		 System.out.println("Enter a number");
		 int n =sc.nextInt();
		 if(isPrime(n))
		 {
			 System.out.println("Prime Number ");
			 
		 }
		 else
		 {
			 System.out.println("Not Prime");
			 
		 }
	 }
			 public static boolean isPrime(int n)
			 {
				 if(n<=1)
				 {
					 return false;
				 }
			 
				 for(int i=2;i<Math.sqrt(n);i++)
				 {
					 if(n%i==0)
					 {
						 return false;
					 }
				 }return true;
			 }	 
			 
		 
		 
	 
 }
 