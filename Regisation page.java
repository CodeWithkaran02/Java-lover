import java.awt.*;
import java.awt.event.*;
class  Regisationpage
{
	JFrame frm;
	JLabel lblUserID ,lblPwd;
	JTextField txtUserID;
	JPasswordField lblPwd;
	JTextField txtPwd;
	
	JButton btnLogin,btnCencle;btnReset;
	
	public void initComp();
	{
		frm= new JFrame("Login page");
		frm.setDefoultCloseOpration(JFrame.EXIT_ON_CLOSE);
		lblUserID = new JLabel("Enter a User id ");
		lblPwd= new JLabel("Enetr a Password");
		txtUserID = new JTextField(10);
		txtPwd= new JTextField(10);
		
		btnLogin = new JButton("Login");
		btnCencle= new JButton("Cencle");
		btnReset= new JButton("Reset");
		
		frm.add(lbl UserID);
		frm.add(txt UserID);
		frm.add(lbl Pwd);
		frm.add(txt Pwd);
		
		frm.add(Login);
		frm.add(Cencle);
		frm.add(Reset);
		
		frm.setLayout(new FlowLayout());
		frm.setSize(500,300);
		frm.setVisible(true);
		
		
		
	}
	
	public void actionPerfromed(ActionEvent ae)
	{
		JButton src= (JButton)ae.getSource();
		String use = txtuse.getTxt();
		String pwd = txtpwd.getTxt();
		//if(src==btnLogin)
			
	}
	public static void main(String args [])
	{
		new Regisationpage rp = new Regisationpage();
		rp .initComp();
	}
}