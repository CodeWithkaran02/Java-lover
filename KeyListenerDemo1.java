import java.awt.*;
import java.awt.event.*;
class KeyListenerDemo extends Frame implements KeyListener
{
	Label l;
	TextArea area ;
	KeyListenerDemo()
	{
		l= new Label();
		l.setBounds (20,30,300,300);
		area = new TextArea ();
		area.addKeyListener(this);
		add(l);
		add(area);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
		
		public void keyPressed(KeyEvent kp)
		{
			l.setText("Key Pressed");
			
		}	
		public void keyReleased(KeyEvent kr)
		{
			l.setText("KeyRealeased");
		}
		public void keyTyped(KeyEvent kt)
		{
			l.setText("KeyType");
		}
		public static void main(String [] args )
		{
			new KeyListenerDemo();
		}
	
}