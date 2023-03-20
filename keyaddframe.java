import java.swing.*;
import java.awt.*;
import java.awt.event.*;
class keyaddframe extends Frame implements KeyListener 
{
	Label l ;
	TextArea  area ;
	keyaddframe
	{
		l= new Label();
		l.setBounds(20,30,300,300);
		area = new TextArea();
		area.addKeyListener(this);
		add(l);
		add(area);
		setSize(400,400);
		setLayput(null);
		setVisible(true);
	}
	public void keyPrassed(keyEvent kp)
	{
		l.setText("keyPrassed");
	}
	public void keyReleased(keyEvent kr)
	{
		l.setText("keyReleased");
	}
	public void keyTyped(keyEvent kt)
	{
		l.setText("keyTyped ");
	}
	public static void main(String args [])
	{
		new keyaddframe();
	}
}