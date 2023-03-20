import java.util.*;
class ExceptionDemo3

{
	int num1,num2,res;
	public void testException()
	Scanner sc = new Scaneer(System.in);
	System.out.println("Enter the num1");
	num1=sc.nextInt();
	System.out.println("Enter the num2")
	num2=sc.nextInt()
	
	try
	{
		System.out.println("Line1 ");
		throws Exception();
		System.out.println("Line2");
		res= num1/num2;
		System.out.println("Line 3");
		System.out.println("Line 4");
		
		
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
		
		
	}
	finally
	{
		System.out.println("Bye bye!")
	}
	public static void main(String args [])
	{
		ExceptionDemo3 ed= new ExceptionDemo3();
		ed.testException();

	}
}