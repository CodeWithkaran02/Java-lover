import java.util.*;
public class InverseOFaNumber {
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos  = sc.nextInt();
		int sum=0;
		while(n!=0) {
			int digit = n%10;
			int v1=pos*(int)Math.pow(10, digit-1);
			sum+= v1;
					pos ++;
					n = n/10;
				System.out.println(sum);
		}
	
	}
}
