import java.util.Scanner;
class CWKK_ex_01
{
	public static void main(String args [])
	{
		System.out.println("This is a calculte the no. convert parcentage ");
		Subject s1 = new Subject();
		System.out.println("Enter a math marks :");
		Scanner sc = new Scanner(System.in);
		s1.mth = sc.nextInt();
		
		Subject s2 = new Subject();
		System.out.println("Enter a Science marks ");
		s2.sci = sc.nextInt();
		
		Subject s3 = new Subject();
		System.out.println("Enter a Hindi marks ");
		s3.hid = sc.nextInt();
		
		Subject s4 = new Subject ();
		System.out.println("Enter the English marks ");
		s4.eng = sc.nextInt();
		
		Subject s5 = new Subject();
		System.out.println("Enter the SocialScience marks ");
		s5.ss = nextInt();
		
		int total = (s1.mth)+(s2.sci)+(s3.hid)+(s4.eng)+(s5.ss);
		int per = (total *100/500);
		
		System.out.println("Parcentage Obtanind :" +per );
		
	}
}