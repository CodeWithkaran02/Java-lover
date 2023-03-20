import java.io.*;
import java.net.*;
class ClientApp
{
 public static void main(String args [])
 {
	 Socket s = new Socket(args[0],5678);
	 System.out.println("connected to host at port no. 5678");
	 ObjectOutputStream out = new ObjectOutputStream (s.getOutputStream());
	 String  classFile = "Job.class";
	 FileInputStream fis = new  FileInputStream(classFile);
	 byte[] b = new byte[fis.available()];
	 fis.read(b);
	 
	 Job aJob = new Job(); 
     out.writeObject(aJob); 
	 
	 System.out.println("Submitted a job Execution");
	 ObjectInputStream in = new  ObjectInputStream(s.getInputStream());
	classFile = (String)in.readObject();
	b= (byte[])in.readObject();
     FileOutputStream fos = new  FileOutputStream(classFile);
	 fos.write(b);
	 Result r = (Result)in.readObject();
	 System.out.println("result="+r.output()+",time taken = " +r.campletionTime()+"ns");
	 Socket.Close();
 }
}