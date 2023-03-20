class Calculetor
{
	int a,b,c;
	public void add(int x,int y)
	{
		c=x+y;
		System.out.println(c);
	}
	public static void main(String [] args)
	{
		Calculetor cal = new Calculetor();
		cal.add(50,60);
	}
}