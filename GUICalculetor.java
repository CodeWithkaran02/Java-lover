import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUICalculetor
{
	JFrame frm;
	JPanel pnlhead,pnlbody;
	JTextField txtDisplay;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnADD,btnSub,btnMul,btnDvd,btnEql,btnDec,btnC,btnOFF,btnON;
	public void initialize()
	{
		frm = new JFrame("My calculator");
		pnlhead = new JPanel();
		pnlbody= new JPanel();
		txtDisplay = new JTextField(10);
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnADD = new JButton("+");
		btnSub = new JButton("-");
		btnMul = new JButton("*");
		btnDvd = new JButton("/");
		btnOFF = new JButton("OFF");
		btnON = new JButton("ON");
		btnC = new JButton("Clear");
		btnDec = new JButton(".");
	}
	public void addComp()
	{
		frm.setSize(300,500);
		frm.setLayout(new  GridLayout(2,1));
		frm.add(pnlhead);
		pnlhead.setLayout(new BorderLayout());
		pnlhead.add(txtDisplay);
		frm.add(pnlbody);
		pnlbody.setLayout(new GridLayout(5,4));
		pnlbody.add(btnOFF);
		pnlbody.add(btnON);
		pnlbody.add(btnC);
		//pnlbody.add(btnC);
		pnlbody.add(btn9);
		pnlbody.add(btn8);
		pnlbody.add(btn7);
		pnlbody.add(btn6);
		pnlbody.add(btn5);
		pnlbody.add(btn4);
		pnlbody.add(btn3);
		pnlbody.add(btn2);
		pnlbody.add(btn1);
		pnlbody.add(btnADD);
		pnlbody.add(btnSub);
	    pnlbody.add(btnMul);
		pnlbody.add(btnC);
		pnlbody.add(btnDec);
		pnlbody.add(btnDvd);
		
		frm.setVisible(true);
		
	}
	public static void main(String args [])
	{
		GUICalculetor GC = new GUICalculetor();
		GC.initialize();
		GC.addComp();
	}
	
}