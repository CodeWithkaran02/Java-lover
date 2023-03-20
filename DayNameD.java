import java.util.*;

 class DayNameD {
    public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       int str;
       System.out.println("Enter The Number :");
       str = sc.nextInt();
       if (str==1)
       {
          System.out.println("Monday");
       }
       else if(str==2)
       {
           System.out.println("Tuesday");
       }
       else if(str==3)
       {
           System.out.println("Wednesday");
       }
       else if(str==4)
       {
           System.out.println("Thursday");
       }
       else if(str==5)
       {
           System.out.println("Friday");
       }
       else if(str==6)
       {
           System.out.println("Saturday");
       }
       else if(str==7);
       {
           System.out.println("Sunday");
       }
			else
		   {
			   System.out.println("Invalid Number");
		   }
    }
    
}