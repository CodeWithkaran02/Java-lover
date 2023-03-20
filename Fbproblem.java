import java.io.*;
class Fbproblem
{
	public static void main(String args []) throws Exception 
	{
		String name = "text";
		File  fw = new File ("name");
		try
		{
			PrintWrite wr = new PrintWrite("fw");
			wr println("Study will for final exam");
			wr println("it will an eaxy exam");
			wr println("just study will ans concadinate during the exam");
			wr println("Good luck");
			wr close();
		}
		catch(Exception e)
		{
			System.out.peintln(e);
		}
	}
}