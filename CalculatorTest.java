class CalculetorTest1 implements Test1
{
	int a,b,c;
	public void add(int x,int y)
	{
		c=x+y;
		System.out.println(c);
	}
	public void massege()
	{
		System.out.println("Hello ");
	}
	public static void main(String [] args)
	{
		CalculetorTest1 cal = new CalculetorTest1();
		cal.add(50,60);
		cal.massege();
	}
}