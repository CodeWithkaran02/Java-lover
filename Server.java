import  java.io.*;
import java.net.*;
class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(6789);
	    System.out.println("Server is Listering o port 6789");
		Socket serverEnd = serverSocket.accept();
		System.out.println("Request accepted");
		BufferedReader fromUser = new BufferedReader(new InputStreamReader(serverEnd.getInputStream())); 

		PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(),true);
		int n = Integer.parseInt(fromUser.readLine());
		System.out.println("Recived from Clint :"+n);
		int fact=1;
		for (int i=2;i<=n;i++) 
			fact *=i;
			
	     toClient.println(fact);
		 System.out.println("Send to Client:"+fact);
		 
		
			
	}
}