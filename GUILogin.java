import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUILogin 
{
	JFrame frmLogin;
	JLabel lblUID ,lblPass,lblHeader;
	JTextField txtUID,txtPass;
	JButton btnLogin,btnQuit;
	
	public GUILogin()
	{
		frmLogin = new JFrame("Login Page");
		lblUID = new JLabel("Enter UserId");
		lblPass= new JLabel("Enetr Password");
		
		
		txtUID = new JTextField(10);
		//txtUID.setBounds(60,150,100,50);
		txtPass = new JTextField(10);
		//txtPass.setBounds(80,170.100,50);
		
		btnLogin = new JButton("Login");
	//	btnLogin.setBounds(280,350,80,40);
		frmLogin.add(btnLogin);
		
		btnQuit = new JButton("Quit");
		//btnQuit.setBounds(380,400,80,40);
		frmLogin.add(btnQuit);
		
		
		
	}
	public void addComp()
	{
		frmLogin.add(lblHeader);
		frmLogin.add(lblUID);
		frmLogin.add(txtUID);
		frmLogin.add(lblPass);
		frmLogin.add(txtPass);
		frmLogin.add(txtPass);
		//frmLogin.add(Login);
		//frmLogin.add(Quit);
		frmLogin.setSize(800,600);
		frmLogin.setLayout(new FlowLayout());
		frmLogin.setVisible(true);
		
	}
	public static void main(String args[])
	{
		GUILogin gl = new GUILogin();
		gl.addComp();
	}
}