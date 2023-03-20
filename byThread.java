class byThread extends Thread
{
	public void run()
	{
		System.out.println("My First ever thread Program");
	}
	public static void main(Strings args [])
	{
		First Thread btc = new First Thread ();
		First Thread btc2 = new First Thread();
		btc.start(7);
		System.out.println("Thread state = "+btc.isAlive());
		System.out.println("Thread Priority = "+btc.getPriority());
		System.out.println("Thread Name = "+btc.getName());
		System.out.println("Thread ID = "+btc.getId);
		System.out.println("Thread Priority = "+btc.isAlive);
		
		btc2.setPriority(Thread MAX_PRIORITY)
		btc2.start();
		
		System.out.println("Thread state ="+btc2.isAlive());
		System.out.println("Thread Priority ="+btc2.getPriority);
		System.out.println("Thread Name = "+btc.getName());
		System.out.println("Thread ID = "+btc.getId);
		System.out.println("Thread Priority = "+btc.isAlive);
	}
}