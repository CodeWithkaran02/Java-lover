import java.util.Scanner;
public class AndOprator {
 public static void main(String args [])
 {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 if(n>0 && n<10)
	 {
		 System.out.println("Valid Input");
	 }
	 else
	 {
		 System.out.println("Invalid Input");
	 }
 }
}
