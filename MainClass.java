class Mythread extends Thread
{
	public void run()
	{
		System.out.println("Implemation by Thread class");
		
	}
}
 class MainClass
 {
	 public static void main(String args [])
	 {
		 Mythread obj = new Mythread();
		 obj.start();
	 }
 }