import java.awt.*;
import javax.swing.*;
class fbutton 
{
	JFrame frm;
	JButton btn 1, btn 2, btn 3,btn 4;
	fbutton()
	{
		frm= new JFrame("setLayout");
		btn 1 = new JButton("Button 1");
	    btn 2 = new JButton("JButton 2");
		btn 3 = new JButton ("JButton 3");
		btn 4 = new JButton ("JButton 4");
		
		frm.setSize(500,400);
		frm.setLayout(null);
		frm.setVisible(true);
		
		btn.setBounds(150,100,100,30);
		frm.add(btn 1);
		btn.setBounds(300,100,100,30);
		frm.add(btn 2);
		btn.setBounds(150,150,100,30);
		frm.add(btn 3);
		
		frm.setBounds(300,150,100,30);
		frm.add(btn 4);
		
		

		}
		public static void main (String [] args )
		{
			new fbutton();
		}
}