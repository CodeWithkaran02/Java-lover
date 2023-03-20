import java.util.*;
class VectorDemo
{
	public static void main(String args [])
	{
		Vactor list = new Vactor();
		list.addElement("Ram");
		list.addElement("Shiyam");
		list.addelement("Sita");
		System.out.println("the Element of Vector: "+ list);
		list.insertElementAt("Sonu ,2");
		System.out.println("the last now is :"+list);
	}
}
