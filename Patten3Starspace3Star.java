import java.util.*;
class Patten3Starspace3Star
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1, nstar=n/2+1, nspace =1;
		while(row<=n)
		{
			for(int i =1; i<=nstar; i++)
			{
				System.out.print("*\t");
			}
			for(int i = 1; i<=nspace; i++)
			{
				System.out.print("\t");
			}
			for(int i = 1; i<=nstar;i++)
			{
				System.out.print("*\t");
			}
			System.out.println();
			if(row<=n/2)
			{
				nstar = nstar-1;
				nspace = nspace+2;
			}
			else
			{
				nstar = nstar+1;
				nspace = nspace-2;
			}
			row++;
		}
	}
}