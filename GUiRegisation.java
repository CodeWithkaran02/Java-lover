import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUIRegisation
{
	JLabel l1,l2,l3;
	JTextField tf1,tf2;
	//JBackgounds (Color.blue);
	JButton btn1,btn2;
	JPasswordField p1;
	
	GUIRegisation()
	{
		setVisible(true);
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1= new JLabel("Regisation From");
		l2= new JLabel("Name");
		setBounds(10,60,150,30);
		add(l2);
		
		l3= new JLabel("Password");
		l3.setBounds(10,120,150,30);
		add(l3);
		
		btn1= new JButton("Submit");
		btn1.setBounds(150,220,200,50);
		add(btn1);
		
		btn2= new JButton("Cencel");
		btn2.setBounds(300,220,200,50);
		add(btn2);
		
		tf1=new  JTextField(" ");
		tf2= new JTextField(" " );
		
		
		
	}
	public static void main(String args[])
	{
		new GUIRegisation();
	}
	

}