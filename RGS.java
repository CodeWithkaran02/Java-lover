import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RGS
{
	JFrame frm;
	JLabel lblUID,lalPass;
	JTextField txtUID,txtPass;
	JButton btnUID ,btnPass;
	
	public RES()
	{
	 frm = new JFrame("Login Page");
     lblUID = JLabel ("Enter the UID ");
	 lblUID.setBounds("30,50,100,30");
	 lblPass = new JFrame("Enter Password");
	 lblPass.setBounds("30,100,100,30");
	 
	 txtUID =new JTextField(10);
     txtUID.setBounds("60,50,100,30");
	 txtPass= new JTextField(10);
	 txtPass.setBounds("60,100,100,50");
	 btnLogin= JButton("Login");
	 btnLogin.setBounds("60,150,100,80");
	 btnQuit= new JBUtton("Quit");
	 btnQuit.setBounds("120,300,100,80");
	 
	 
	}
	public void addComp()
	{
		frm.add(lblUID);
		fr.add(lblPass);
		frm.add(txtUID);
		frm.add(txtPass);
		frm.add(lblUID);
		frm.add(lblPass);
		frm.add(btnLogin);
		frm.add(btnQuit);
		
		frm.setSize(800,600);
		frm.setLayout(new FlowLayout());
		frm.setVisible(true);
		
	}
	public static void main(String args[])
	{
		RES rl =new RES();
		rl.addComp();
	}
}