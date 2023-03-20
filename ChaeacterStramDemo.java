import java.io.*;
class ChaeacterStramDemo
{
	public static void main(String abc []) throws IOException
	{
		
		Reader rd = new FileReader(abc [0]);
		Writer wt = new FileWriter(abc [1]);
		int data;
		while ((data =rd.read())!=-1)
		{
			System.out.println((char)data);
			wt.write(data);
			
		}
		rd.close();
		wt.close();
	}
	
}