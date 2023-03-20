import java.util.*;
class Patter3rdlineStar5star
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, nsapce =n/2,nstar=n-nsapce;
		while(row<=n)
		{
			for(int i = 1; i<=nsapce; i++)
			{
				if(row<=n/2+1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				for(int j =1; j<=nstar;j++)
				{
					System.out.print("*\t");
				}
				System.out.println("");
				if(row<=n/2)
				{
					nstar = nstar+1;
					
				}
				else
				{
					nstar=nstar-1;
				}
				row++;
			}
		}
	}
}