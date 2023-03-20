import java.util.*;
class ISaPrimeOrNot
{
  
  public static void main(String[] args) 
  {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
	   int n = scn.nextInt();
       int t = scn.nextInt();
      for(int j =1;j<=t;j++)
      {
        int flag =1;
	  
        for(int i=2; i*i<=n; i++){
          if(n%i==0)
          {
            flag =0;
            break;
          }
          if(flag ==1)
          {
            System.out.println("prime");
          }
          else {
            System.out.println("not prime");
            
          }
        }
      
	  }
   }
  }