class MyThread implements Runnable
{
	public void run()
	{
	   System.out.println("By Runnable InterFace");
	}
}
class mainClassThread 
{
	public static void main(String args [])
	{
		MyThread obj = new MyThread();
		Thread t = new Mythread(obj);
		t.start();
	}
}