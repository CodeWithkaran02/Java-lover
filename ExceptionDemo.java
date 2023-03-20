import java.io.*;
class ExceptionDemo
{
	int num1,num2,res;
	public void testException()throws Exception
	{
		BufferReader br= new BufferReader(new InputStremeReader(System.in));
		System.out.println("Enter num1");
		num1= Integer.parseInt(br.readLine);
		System.out.println("Enetr num2");
		num2= Integer.parseInt(br.readLine);
		
		res=num1/num2;
		
	 System.out.println("Result:"+res);
	 
	}
	public static void main(Strings args [])throws Exception
	{
		ExceptionDemo ed= new ExceptionDemo();
		ed.testException();
	}
}