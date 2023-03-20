import java.util.*;
class RotateaNumber
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int  count =0;
		int num = sc.nextInt();
		int tnum = num ;
		while(tnum !=0){
			tnum = tnum/10;
			count++;
		}
		k=k%count;
		if(k<0)
			{
				k = k+count;
			}
			int temp1 = (int)Math.pow(10,k);
			int p1 = num%temp1;
			int p2 = num/10;
			int temp2= (int )Math.pow(10,count-k);
			int ans = p1*temp2 +p2;
			System.out.println(ans);
	}
}