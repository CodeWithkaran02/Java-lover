import java.util.*;
class Homework11
{
	Static String triangleType(int a, int b,int c)
	{
		if(a==b&&b==c&&c==a)
			return"Equilateral";
		else if 
		    return "Isosceles"
		else
			return "Scaler"
	}
	static String angleType(int a,int b,int c)
	{
		int x= a*a;
		int y=b*b;
		int z=c*c;
		
		if(a>b&&a>c)
		{			
		
		if(x==y+z)
		 return "Right-angle";
	    else if (x<y+z)
			return "Acute-angle";
		else
			return "Obtare- angle";
		}
		else(b>a&&b>c)
		{
			if(y==x+z)
				return "Right-angle";
			else if (y<x+z)
				return "Acute-angle";
			else 
				return "Obture-angle";
			
		}
		else
		{
			if(z==x+y)
				return "Right-angle";
			else if
			    return "Acute-angle";
			else
				return "Obture-angle";
			
		}
	}
	Static void triangle(int a,int b,int c)
	{
		System.out.println("Triangle is "triangle (a,b,c)+"and "+angletype(a,b,c));
		
	}
	public static void main(String args [])
	{
		int a,b,c;
		System.out.println("Enter the side of triangle:");
		Scanner sc = new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==0||b==0|||c==0)
			System.out.println("Triangle cannot be found");
		else
			triangle(a,b,c);
	}
	
}
