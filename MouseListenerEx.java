import java.awt.*;
import java.awt.event.*;
class MouseListenerEx extends Frame implements MouseListener
{
	Label l;
	MouseListenerEx()
	{
		addMouseListener(this);
		l= new Label();
		l.setBounds(150,150,100,120);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}

		public void mouseClicked(MouseEvent e)
		{
			l.setText("Mouse clicked");
			
		}
		public void mouseEntered(MouseEvent e)
		{
			l.setText("mouse Enetered");
			
		}
		public void mouseExited(MouseEvent e)
		{
			l.setText("Mouse Exited");
			
		}
		public void mousePressed(MouseEvent e)
		{
			l.setText("Mouse Pressed");
			
		}
		public void mouseReleased(MouseEvent e)
		{
			l.setText ("mouse Released");
			
		
		}
	
public static void main(String [] args)
{
   new MouseListenerEx();
}
}