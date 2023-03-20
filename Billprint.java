import java.util.Scanner.*;
class Billprint
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int units, bill;
		
		System.out.println("Enetr the unit Comsumed");
		
		units = sc.nextInt();
		if(units<100)
		bill= units*2+50;
	
	else if(units <=300)
		bill= 100*2(units -100)*3+50;
	else
		bill=100*2+200*3+(units-300)*4+50;
	
	System.out.println("Bill print="+bill);
	}
}