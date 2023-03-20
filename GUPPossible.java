import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUPPossible
{
	GUPPossible()
	{
	JFrame f = new JFrame();
  
	JTextArea txtArea;
    JTextField tf = new JTextField("1. who  is java devloper ....?");
	tf.setBackground (Color.blue);
	tf.setEditable(false); 
	tf.setBounds(90,30,500,100);
	
	// Radio option1 
	JRadioButton r1= new JRadioButton("A.) Jam Goslin");
	JRadioButton r2 = new JRadioButton("B.) Mark Zibraock ");
	JRadioButton r3 = new JRadioButton("C.) Elion Mask");
	JRadioButton r4 =new JRadioButton ("D.) Bill Gate");
	
	r1.setBounds(100,150,150,100);
	r2.setBounds(250,150,150,100); 
	r3.setBounds(100,240,150,50);
	r4.setBounds(250,240,180,50);
	
	
	//Button option 2
	JButton b1 = new JButton("Pervious");
	b1.setBackground(Color.CYAN);
	b1.setBounds(60,380,100,30);
	JButton b2 = new JButton("Next");
	b2.setBackground(Color.CYAN);
	b2.setBounds(180,380,100,30);
	JButton b3 = new JButton("Reset");
	b3.setBackground(Color.CYAN);
	b3.setBounds(300,380,100,30);
	JButton b4 = new JButton("Submt");
	b4.setBackground(Color.CYAN);
	b4.setBounds(420,380,100,30);
	
	
	f.add(tf);
	
	f.add(r1);
	f.add(r2);
	f.add(r3);
	f.add(r4);
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	
	f.setSize(600,600);
	f.setTitle("Title page");
	
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
	
	
	
	
	
	
}
public static void main(String [] args)
{
	GUPPossible gp = new GUPPossible();
}
}