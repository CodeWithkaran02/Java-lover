import java.util.*;
class ExpectionDemo
{
int num1,num2,res;
public void testExcption()throws Exception
{
 	Scanner sc = new Scanner(System.in); 
	System.out.println("Enetr num1");
	num1= sc.nextInt();
	System.out.println("Enetr num2");
	num2 = sc.nextInt();
	
	try
	{
		res= num1/num2;
		System.out.println("Result :"+res);
		
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
		
	}
	finally
	{
		System.out.println("Bye bye! ");
	}
}
public static void main(String args[])throws Exception
{
	ExpectionDemo ed=new ExpectionDemo();
	ed.testExcption();
}
}