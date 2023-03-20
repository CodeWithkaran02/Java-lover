class Square2
{
	public static void main(String args [])
	{
		int a[]={1,2,3,4,5};
		int n=a.length;
		int b=0;
		
		for(int i=0;i<n;i++)
		{
			int sq=a[i]*a[i];
			System.out.println(sq);
			
			b=b+sq;
			
		}
		int c=b/n;
		
		System.out.println("Root mean Square = "+c);
	}
}