import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIFrame 
{
	GUIFrame()
	{
		//JFrame frm;
		//JLabel l;
		JLabel l = new JLabel( "GUIFrame");
		l.setBounds(90,30,500,100);
		//Color c = new Color(50,125,120);
		//c.getContentPane().setBackground(c);
		
		//JRadioButton r1,r2,r3, r4;
		//JButton btnPerivos,btnNext,btnSubmit,btnReset;
		//JButtom btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
		
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.RED);
		pan1.setBounds(50,100,500,200);
		
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.RED);
		pan2.setBounds(600,400,100,300);
		
		
		JFrame  frm  = new JFrame(" this is layout of Frame ");
		Color c = new Color(50,125,120);
		frm.getContentPane().setBackground(c);
		JRadioButton r1= new JRadioButton ("A.) Jam Goslin");
		JRadioButton r2= new JRadioButton ("B.) Mark Zibraock ");
		JRadioButton r3= new JRadioButton ("C.) Elion Mask");
		JRadioButton r4= new JRadioButton("D.) Bill Gate");
		
		// Radiobutton 1
		r1.setBounds(350,100,100,30);
		r2.setBounds(450,100,100,30);
		r3.setBounds(350,150,100,30);
		r4.setBounds(450,150,100,30);
		
		//lowerbutton 2
		
		JButton b1 = new JButton("Pervious");
		b1.setBackground(Color.RED);
		b1.setBounds(60,380,100,30);
		JButton b2 = new JButton("Next");
		b2.setBackground(Color.RED);
		b2.setBounds(180,380,100,30);
		JButton b3 = new JButton("Reset");
		b3.setBackground(Color.RED);
		b3.setBounds(300,380,100,30);
		JButton b4 = new JButton("Submit");
		b4.setBackground(Color.RED);
		b4.setBounds(420,380,100,30);
		
		
		
		// side button 3
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.CYAN);
		btn1.setBounds( 630,290,60,50 );
	    JButton btn2 = new JButton("2");
		btn2.setBackground(Color.CYAN); 
		btn2.setBounds( 630,390,60,50 );
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.CYAN);
		btn3.setBounds( 670,350,100,50 ); 
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.CYAN);
		btn4.setBounds( 670,0,30,50  );
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.CYAN);
		btn5.setBounds(670,90,30,50   );
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.CYAN);
		btn6.setBounds( 690,90,30,50   );
		JButton btn7= new JButton("7");
		btn7.setBackground(Color.CYAN);
		btn7.setBounds( 710,90,30,50   );
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.CYAN);
		btn8.setBounds(  730,90,30,50  );
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.CYAN);
		btn9.setBounds(  730,90,30,50  );
		JButton btn10 = new JButton("10");
		btn10.setBackground(Color.CYAN);
		btn10.setBounds( 750,90,30,50   );
		JButton btn11 = new JButton("11");
		btn11.setBackground(Color.CYAN);
		btn11.setBounds( 770,90,30,50   );
		JButton btn12 = new JButton("12");
		btn12.setBackground(Color.CYAN);
		btn12.setBounds(  790,90,30,50  );
		
		
		frm.add(l);
		
		l.add(pan1);
		l.add(pan2);
		
		
		l.add(r1);
		l.add(r2);
		l.add(r3);
		l.add(r4);
		
		l.add(b1);
		l.add(b2);
		l.add(b3);
	    l.add(b4);
		
		
		l.add(btn1);
		l.add(btn2);
		l.add(btn3);
		l.add(btn4);
		l.add(btn5);
		l.add(btn6);
		l.add(btn7);
		l.add(btn8);
		l.add(btn9);
		l.add(btn10);
		l.add(btn11);
		l.add(btn12);
		
		
		frm.setSize(1280,720);
		l.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
		
		
		
		public static void main(String [] args)
		{
			
			new GUIFrame();
		}

}

