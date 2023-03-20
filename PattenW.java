import java.util.*;
class PattenW
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    for(int row= 1; row<=n; row++)
		{
			for(int colm = 1; colm<=n;colm++)
			{
				if(colm= 1||colm=n)
				{
					System.out.print("*\t");
				}
				else if(row==colm || row+colm=n+1)
					{
						if(row>=n/2+1)
						{
							System.out.print("*\t");
						}
						else
						{
							System.out.print("\t");
						}
				}
			System.out.println();
			}
		}
	}
}