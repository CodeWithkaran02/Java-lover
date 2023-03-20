import java.io.*;
import java.net.*;
class ServerTest
{
	public static void main (String args[]) throws Exception
	
	{
		ServerSocket ss = new ServerSocket(6789);
		System.out.println("Server is Lisrwning om port 6789");
		SocketSocket = ServerSocket.accept();
		System.out.println("Request accpted");
		ObjectInputStream in = new ObjectInputStream (Socket.getInputStream());
		String ClassFile = (String)in.readObject();
		byte [] b= (byte[])in.readObject();
		FileOutStream fos = new FileOutStream(classFile);
		fos.write(b);
		Exeutable ex = (Exeutable ) in.readObject();
		System.out.println("Stating exeation....");
		 double StartTime = System.nenoTime();
		 String output = ex.execute();
		 double endTime = System.nenoTime();
		 double completionTime = endTime - startTime;
		 System.out.println("[Done]");
		 ResultImpl r = new ResultImpl(Output,completionTime );
		 ObjectOutStream out = new ObjectOutStream(Socket.getOutputStram());
		 Class File = "ResultImpl.Class";
		 out.writeObject(bo);
		 out.writeObject(r);
		 System.out.println("Result.Sort");
		 Socket.Close();
	}
}