import java.util.*;
class DQP
{
	public static void main(String args [])
	{
		int arr1[] ={2,5,0,1,3};
		System.out.println("the smaller element of the array:"+Smallerelement(arr1));
		
		int arr2[] ={8,10,5,7,9};
		System.out.println("The largest  element of the array :"+Smallerelement(arr2));
		
	}
	static int  Smallerelement(int arr[])
	{
		int min=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}	
}