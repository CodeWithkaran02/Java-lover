import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  Regisationpage 
{
	JFrame frm;
	JLabel lblUserID ,lblPwd;
	JTextField txtUserID;    
	JPasswordField txtPwd;
	//JTextField txtPwd;
	
	JButton btnLogin,btnCencle,btnReset;
	
	public void initComp()
	{
		frm= new JFrame("Login page");
		//frm.setDefoultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblUserID = new JLabel("Enter a User id ");
		lblPwd= new JLabel("Enetr a Password");
		txtUserID = new JTextField(10);
		txtPwd= new JPasswordField(10);
		
		btnLogin = new JButton("Login");
		btnCencle= new JButton("Cencle");
		btnReset= new JButton("Reset");
		
		frm.add(lblUserID);
		frm.add(txtUserID);
		frm.add(lblPwd);
		frm.add(txtPwd);
		
		frm.add(btnLogin);
		frm.add(btnCencle);
		frm.add(btnReset);
		
		frm.setLayout(new FlowLayout());
		frm.setSize(500,300);
		frm.setVisible(true);
		
		
		
	}
	
	public void actionPerfromed(ActionEvent ae)
	{
		JButton src= (JButton)ae.getSource();
		//String use = txtuse.getTxt();
		//String pwd = txtpwd.getTxt();
		/*if(src==btnLogin)
		 {
			 if (use.equals("ABC")&& pwd.equals(123))
			 {
				 System.out.println("Welcome to JAVA GUI APP.");
			 }
			else
			{
			 System.out.println("Invalid USER ID /PASSWORD.");
			 
			} 
			 
		 }
		
		 else if (src==btnCancel)
		 {
			 System.exit(0);
			 
		 }
		 else if (src==btnReset)
		 {
			 txtUserID.setTxt("");
			 txtPwd.setTxt("");
			 
		 }*/
	 
			
	}
	public static void main(String args [])
	{
	   Regisationpage rp = new Regisationpage();
		rp .initComp();
	}
}