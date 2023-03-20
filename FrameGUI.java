import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FrameGUI 
{
JFrame frm;
JTextArea txtArea;
JButton btnPrevious, btnNext,btnReset,btnSubmit;
JButton btnRadio1,btnRadio2,btnRadio3,btnRadio4;
public void initComp()
{
	frm = new JFrame("TextArea");
	frm.setDefoultCloseOperation(JFrame.EXIT_ON_CLOSE);
	txtArea = new JTextArea(150);
	TextRadio = new JRadioButton(50);
	//btnRadio1 = new JButton("Option1");
	//btnRadio2 = new JButton("Option2");
	//btnRadio3 = new JButton("OPtion3");
	//btnRadio4 = new Jbutton ("Option4");
	
	//btnRadio.addActionListener(this);
	//btnRadio.addActionListener(this);
	//btnRadio.addActionListener(this );
	//btnRadio.addActionListener(this );
	
	btnPrevious = new JButton("Previous");
	btnNext    = new JButton("Next");
	btnReset = new JButton("Reset");
	btnSubmit = new JButton("Submit");
	
	//btnPrevious.addActionListener(this);
	//btnNext.addActionListener(this);
	//btnReset.addActionListener(this);
	//btnSubmit.addActionListener(this);
	
	
	frm.add(TextArea);
	frm.add(Radio1);
	frm.add(Radio2);
	frm.add(Radio3);
	frm.add(Radio4);
	frm.add(Previous);
	frm.add(Next);
	frm.add(Reset);
	frm.add(Submit);
	
	frm.setLayout(new FlowLayout());
	frm.setSize(600,300);
	frm.setVisible(true);
	frm.setEditable(false);
	
	
}
public void actionPerfomed(ActionEvent ae)
{
	JButton src= (JButton) ae.getSource();
	String text = txtField.getText();
	String Radio = txtField.getText();
	
}
public static void main(String [] args)
{
	FrameGUI  fg= new FrameGUI();
    fg.initComp();	
    
}

}
