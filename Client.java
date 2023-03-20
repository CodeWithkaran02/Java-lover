import java.io.*;
import java.net.*;
class Client
{
	public static void main(String  args [])throws Exception
	{
		String fact;
		Socket clientEnd = new Socket("localhost",6789);
		System.out.println("Connected to localhost at port 6789");
		PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(),true);
		BufferedReader fromServer = new BufferedReader(new 
        InputStreamReader(clientEnd.getInputStream())); 
		BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a Integer");
		String n = fromUser.readLine();
		toServer.println(n);
		System.out.println("Send to Server:"+n);
		fact = fromServer.readLine();
		System.out.println("Recevied for Server:"+fact);
		clientEnd.close(); 
	}
}