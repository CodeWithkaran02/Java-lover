import java.util.*;
public class Tablewiththehelpofuser {
	public static void main(String aegs [])
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i=i+1)
		{
			int ans = n*i;
			System.out.println(n+" * "+i+" = "+ans);
		}
		
	}

}
