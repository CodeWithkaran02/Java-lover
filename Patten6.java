class Patten6
{
	public static void main(String args [])
	{
		int i=1;
		int j=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" *");
				
			}System.out.println( );
		}
		for(;i>1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(" *");
			}System.out.println( );
		}
	}
}