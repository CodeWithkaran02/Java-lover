import java.util.Scanner;
public class Primenumbe {

	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int flag =1;
		for (int i =2;i<=(num-1);i=i+1)
		{
			if(num%i==0)
			flag=0;
		}
		 
		if (flag==1)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("Not Prine");
		}
	}
}
