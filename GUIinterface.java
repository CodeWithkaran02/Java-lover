import java.swing.*;
import java.awt.*;
import java.awt.event.*;
class GUIinterface
{
	GUIinterface()
	{
		JLabel l = new JLabel("GUIInterface");
		l.setBounds (10,30,400,400);
		
		JPanel pan1 = new JPanel();
		pan1.setBackgrounds(Color.RED);
		pan1.setBounds();
		
		JPanel pan1 = new JPanel();
		pan2.setBackground();
		pan2.setBound ();
		
		JFrame frm = new JFrame ("this is new Layout for GUI");
		Color co =new Color(RED);
		JRadioButton jrb1 = new JRadioButton ("1.Chandan ");
		JRadioButton jrb2 = new JRadioButton ("2.Karuna karan");
		JRadioButton jrb3 = new JRadioButton("3.Prince");
		JRadioButton jrb4 = new JRadioButoon ("4. NaveenPrasunn");
		
		//button 
		jre1.setBounds();
		jre2.setBounds ();
		jre3.SetBounds();
		jre4.setBounds();

		//buttonBox 
		JButtom btn1 = new JButton("Previous");
		btn1.setBounds();
		btn2.setBackgounds();
		
		JButton btn2 = new JButton("Next");
		btn2.setBounds();
		btn2.setBackgrounds();
		
		JButton btn3 = new JButton("Reset");
		btn3.setBounds();
		btn3.setBackground();
		
		JButton btn4 = new JButton("Submit");
		btn4.setBounds();
		btn4.setBackgrounds();
		
		//Side Button 
		JButton b1 = new JButton("1");
		b1.setBounds();
		b1.setBackgrounds();
		
		JButton b2= new JButton ("2");
		b2.setBounds();
		b2.setBackgrounds();
		
		JButton b3 = new JButton ("3");
		b3.setBounds();
		b3.setBackground();
		
		JButton b4 = new Button("4");
		b4.setBounds();
		b4.setBackgrounds();
		
		JButton b5 = new Button ("5");
		b5.setBounds();
		b5.setBackgrounds();
		
		JButton b6 = new JButton("6");
		b6.setBounds();
		b6.setBackgrounds();

	   JButton b7 = new JButton ("7");
	   b7.setBounds();
	   b7.setBackgrounds();
	   
	   JButton b8 = new Jbutton ("8");
	   b8.setBounds();
	   b8.setBackgrounds();
	   
	   JButton b9 = new JButton ("9");
	   b9.setBounds();
	   b9.setBackgrounds();
	   
	   JButton b10 = new JButton ("10");
	   b10.setBounds();
	   b10.setBackgrounds();
	   
	   JButton b11= new JButton ("11");
	   b11.setBounds();
	   b11.setBackgrounds();
	   
	   JButton b12 = new JButton ("12");
	   b12.setBounds();
	   b12.setBackgrounds();
	   
	   frm.add(l);
	   
	   l.add(pan1);
	   l.add(pan2);
	   
	   l.add(jre1);
	   l.add(jre2);
	   l.add(jre3);
	   l.add(jre4);
	   
	   l.add(btn1);
	   l.add(btn2);
	   l.add(btn3);
	   l.add(btn4);
	   
	   l.add(b1);
	   l.add(b2);
	   l.add(b3);
	   l.add(b4);
	   l.add(b5);
	   l.add(b6);
	   l.add(b7);
	   l.add(b8);
	   l.add(b9);
	   l.add(b10);
	   l.add(b11);
	   l.add(b12);
	   
	   frm.setSize(1280,800);
	   l.setLayout(null);
	   frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frm.setVisible(true);
	}
   
   public static void main(String [] args)
   {
	   new GUIinterface();
   }
	
}