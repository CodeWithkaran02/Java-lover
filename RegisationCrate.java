import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegisationCrate extends JFrame /*implements ActionListener*/
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField tf1,tf2,tf5,tf6,tf7,tf8;
	JButton b1,b2;
	JPasswordField p1,p2;
	RegisationCrate()
	{
		setVisible(true);
		setSize(800,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Regisation for Window Page");
		l1= new JLabel("Regisation for Window Page");
		l1= new JLabel("Regisation Page");
		l1.setForeground(Color.blue);
		setFont(new Font ("Serif", Font.BOLD,20 ));
		
		l2= new JLabel(" Name:");
		l2.setBounds(200, 50, 400, 30 );
		add(l2);
		
		l3 = new JLabel("Email id:");
		l3.setBounds(200, 90, 400, 30 );
		add(l3);
		
		l4= new JLabel("Crete Password:");
		l4.setBounds(200,130,400,30);
		add(l4);
		
		l5 = new JLabel("Confrom Password:");
		l5.setBounds( 200,170,400,30);
		add(l5);
		
		l6= new JLabel("Country:");
		l6.setBounds( 200,210,400,30);
		add(l6);
		
		l7= new JLabel("State:");
		l7.setBounds( 200,250,400,30);
		add(l7);
		
		l8= new JLabel("Phone no:");
		l8.setBounds(200,290,400,30 );
		add(l8);
		
		tf1= new JTextField();
		tf1.setBounds(400, 90, 200, 30);
		add(tf1);
		
		tf2= new JTextField();
		tf2.setBounds(400,130, 200, 30);
		add(tf2);
		
		tf5= new JTextField();
		tf5.setBounds(400,170,200,30); 
		add(tf5);
		
		
		b1= new JButton("Submit");
		b1.setBounds(150, 350, 150, 60);
		add(b1);
		
		b2= new JButton("Cencle");
		b2.setBounds(520, 350, 150, 60);
		add(b2);
		
		p1= new JPasswordField();
		p1.setBounds(400,170,200,30);
		add(p1);
		
		p2= new JPasswordField();
		p2.setBounds(400,210,200,30);
		add(p2);
		
		
		    tf1.setText("");  
            tf2.setText("");  
            p1.setText("");  
            p2.setText("");  
	
			
            tf5.setText("");  
            tf6.setText("");  
            tf7.setText("");  
			tf8.setText("");
		
		
		
		
		
	}
	public static void main(String args [])
	{
		new RegisationCrate();
	}
	
	
}