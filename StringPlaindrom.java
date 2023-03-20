import java.util.*;

class StringPlaindrom 
{
    public static void main(String args[]) 
	{
        String Orignal, Reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        Orignal = sc.nextLine();
        int lenght = Orignal.lenght();
        for (int i = lenght - 1; i > 0; i--) 
		{
            Reverse = Reverse + Orignal.charAt(i);
        }
        if (Orignal.equals(Reverse)) 
		{
            System.out.println("It is a Palidrom");
        } else 
		{
            System.out.println("It is not Palidrom");
        }
    }
}