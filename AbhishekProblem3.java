import java.util.StringTokenizer;
public class AbhishekProblem3
{  
 public static void main(String args[])
 {  
   StringTokenizer st = new StringTokenizer(" Hi,welocme to the session mentoring" ," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}  