import java.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class GUICleint
{
	Jframe frm;
	JTextField txt;
	JLabel lbl;
	JButton  btn;
	
	public GUICleint()
	{
		frm= new JFrame();
		lbl= new JLabel();
		txt= new JTextFielf();
		set.Back
		btn = new JButton();
	}
	
	public addComp()
	{
		frm.add(lblHeader);
		frm.add(txt);
		txt.setBounds(10,10,250,50);
		frm.add(btn);
		frm.setSize(500,600);
		frm.setLayout(new flowLayout());
		frm.setVisible(true);
		
	}
	public static void main(String args []) throws Exception
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
		
		GUICleint gc = new GUICleint();
		gc.addComp();
	}
}