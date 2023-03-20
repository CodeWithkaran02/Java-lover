import java.awt.*;
class GUIClass 
{
	 Frame frmLogin;
	 Label lblUID, lblPass, lblHeader;
	 TextField txtUID,txtPass ;
	 Button btnLogin ,btnQuit;
	 
	 public GUIClass ()
	 {
		 frmLogin = new Frame ("Login page .......");
		 lblUID = new Label ("Enter UserID");
		 lblPass = new Label ("Enter  Password");
		 lblHeader = new  Label("Enter the Login detail....");
		 
		 txtUID = new TextField(10);
		 txtPass = new TextField(10);
		 btnLogin = new Button("Login");
		 btnQuit = new Button("Quit");
		 
	 }
	 public void addComp()
	 {
		 frmLogin.add(lblHeader);
		 frmLogin.add(lblUID);
		 frmLogin.add(txtUID);
		 frmLogin.add(lblPass);
		 frmLogin.add(txtPass);
		 frmLogin.add(btnLogin);
		 frmLogin.add(btnQuit);
		 
		 frmLogin.setSize(440 ,270);
		 frmLogin.setLayout(new FlowLayout());
		 frmLogin.setVisible(true);
		 
	 }
	 public static void main(String [] aa)
	 {
		 GUIClass obj = new GUIClass();
		 obj.addComp();
	 }
}