import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LayoutDemo implements ActionListener
{
	JFrame frm;
	JButton btn1,btn2,btn3,btn4;
	LayoutDemo()
	{
		frm = new JFrame("SetBounds demo......");
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		
		frm.setSize(500,400);
		Color c = new Color(50,125,120);
		frm.getContentPane().setBackground(c);
		
		frm.setLayout(null);
		frm.setVisible(true);
		
		btn1.setBounds(150,100,100,30);
		btn1.addActionListener(this);
		btn2.setBounds(300,100,100,30);
		btn3.setBounds(150,150,100,30);
		btn4.setBounds(300,150,100,30);
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			System.out.println("OK");
			MenuExampleDemo me = new MenuExampleDemo();
			
		}
	}
	
		public static void main(String [] args)
		{
			new LayoutDemo();
		}
}