import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GUIAPP
{
	 JFrame frm;
	 //Label lbltext,lblHeader;
	RadioButton ()
	 
	 //public GUIAPP ()
	 
		 frm = new JFrame ();
		 
		
		JRadioButton r1= new JButton("A) this is a java");
		JRadioButton r2= new JButton("B) this is C#");
		JRadioButton r3= new JButton("C)this is Python");
		JRadioButtom r4= new JButton("D)this is a J#");
	 
	     r1.setBounds(75,25,100,30);
		 r2.setBounds(75,50,100,30);
		 r3.setBounds(75,150,100,30);
		 r4.setBounds(75,200,100,30);
		 
		 ButtonGroup bg = new ButtonGroup();
		 bg.add(r1);
		 frm.add(r1);
		 bg.add(r2);
		 frm.add(r2);
		 bg.add(r3);
		 frm.add(r3);
		 bg.add(r4);
		 frm.add(r4);
		 
		 frm.setSize(440 ,270);
		 //frm.setLayout(new FlowLayout());
		 frm.setLayout(null);
		 frm.setVisible(true);
		
		 
	
	 public static void main(String [] aa)
	 {
		 RadioButtonobj = new RadioButton();
		 //obj.addComp();
	 }
}