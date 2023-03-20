import java.util.*;
class PattenStar5space1Star
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for (int row =1; row<=n;row++)
			{
				int nst = n+1-row;
				for(int i =1; i<=nst;i++)
				{
					System.out.print("*\t");
				}
				System.out.println();
			}
	}
}