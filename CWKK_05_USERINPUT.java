import java.util.Scanner;
class CWKK_05_USERINPUT
{
	public static void main(String []args )
	{
		System.out.println("it is a check this is a Interger or not ");
		Scanner sc = new Scanner(System.in);
		//boolean b = sc.hasNextInt(); this is a import when you are recup then you check it 
		//System.out.println(b);
		
		//String str = sc.next();// this is a import when you are recup then you check it
	//	System.out.println(str);
		
		String str = sc.nextLine();
		System.out.println(str);
	}
}