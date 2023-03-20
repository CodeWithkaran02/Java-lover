import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  GUIacttach 
{
	JFrame frm;
	JPanel pan1Q,pan1O,pan1D,pan1N;
	JButton btnPevt,btnNxt,btnRest,btnSubmit;
	JRadioButton btnA,btnB,btnC,btnD;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
	
	public  GUIacttach ()
	{
	  frm= new JFrame("Online Testing ");
	  pan1Q = new JPanel();
	  pan1O= new JPanel();
	  pan1D = new JPanel();
	  pan1N= new JPanel();
	  
	  btnPevt= new JButton("Pevious");
	  btnNxt= new JButton("Next");
	  btnRest = new JButton("Reset");
	  btnSubmit = new JButton("SUBMIT");
	  
	  btnA= new JRadioButton("Option 1");
	  btnB= new JRadioButton("Option 2");
	  btnC= new JRadioButton("Option 3");
	  btnD= new JRadioButton("Option 4");
	  
	  btn1= new JButton("1");
	  btn2= new JButton("2");
	  btn3= new JButton("3");
	  btn4= new JButton("4");
	  btn5= new JButton("5");
	  btn6= new JButton("6");
	  btn7= new JButton("7");
	  btn8= new JButton("8");
	  btn9= new JButton("9");
	  btn10= new JButton("10");
	  btn11= new JButton("11");
	  btn12= new JButton("12");
	}  
	
	public void setComponent()
	{
		
		frm.setSize(1280,720);
		Color c = new Color(50,125,120);
		frm.getContentPane().setBackground(c);
		frm.setLayout(null);
		frm.setVisible(true);
		
		pan1Q.setBackground(Color.green);
		pan1Q.setBounds(10,10,840,300); 
		frm.add(pan1Q);
		
		btnA.setBounds(100,400,150,30);
		frm.add(btnA);
		
	    btnB.setBounds(100,430,150,30);
		frm.add(btnB);
		
		btnC.setBounds(100,460,150,30);
		frm.add(btnC);
		
		btnD.setBounds(100,490,150,30);
		frm.add(btnD);
		
		
		pan1O.setBackground(Color.yellow);
		pan1O.setBounds(10,320,840,280);
		frm.add(pan1O);
		
		pan1D.setBackground(Color.blue);
		pan1D.setBounds(860,10,400,240);
		frm.add(pan1D);
		
		pan1N.setBackground(Color.pink);
		pan1N.setBounds(860,270,400,340);
		frm.add(pan1N);
		
		btn1.setBounds(880,310,80,80);
		frm.add(btn1);
		
		btn2.setBounds(980,310,80,80);
		frm.add(btn2);

		btn3.setBounds(1080,310,80,80);
		frm.add(btn3);
		
		btn4.setBounds(1180,310,80,80);
		frm.add(btn4);
		
		btn5.setBounds(880,400,80,80);
		frm.add(btn5);
		
		btn6.setBounds(980,400,80,80);
		frm.add(btn6);
		
		btn7.setBounds(1080,400,80,80);
		frm.add(btn7);
		
		btn8.setBounds(1180,400,80,80);
		frm.add(btn8);
		
		btn9.setBounds(880,490,80,80);
		frm.add(btn9);
		
		btn10.setBounds(980,490,80,80);
		frm.add(btn10);
		
		btn11.setBounds(1080,490,80,80);
		frm.add(btn11);
		
		btn12.setBounds(1180,490,80,80);
		frm.add(btn12);
		
		
		btnPevt.setBounds(10,610,270,80);
		frm.add(btnPevt);
		
		btnNxt.setBounds(270,610,270,80);
		frm.add(btnNxt);
		
		btnRest.setBounds(560,610,270,80);
		frm.add(btnRest);
		
		btnSubmit.setBounds(840,610,270,80);
		frm.add(btnSubmit);
	}
	
	
	public static void main(String args [])
	{
		 GUIacttach  ga= new  GUIacttach ();
		ga.setComponent();
		
	}
}