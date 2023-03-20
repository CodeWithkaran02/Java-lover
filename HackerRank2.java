import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class HackerRank2
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int b = 1;
		while(sc.hasNext())
		{
			String s =sc.nextLine();
			System.out.println(b+""+s);
			b++;
		}
		sc.close();
		
	}
}
/*
Hello world
I am a file
Read me until end-of-file */