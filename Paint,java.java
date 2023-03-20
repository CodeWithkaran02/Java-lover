import java.awt.*;
import java.awt.event.*;
class Paint extends Frame implements MouseMotionListener
{
	Lable l;
	Color c = Color.BLUE;
	Paint();
	{
		l= new Label();
		l.setBounds(20,40,100,20);
		add(l);
		addMouseMotionListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	public void mouseDragged(Mouse Event e)
	{
		l.setText("X="+e.get X() +,"Y="+e get Y());
		Graphics g = getGraphics();
		g.setColor(Color.RED);
		g.drawOveal(e.getX(),e.getY(),40,20);
		
	}
	public void mouseMoved(Mouse Event e )
	{
		l.setText("X="+e.getX()+)"Y="+e.get Y())
		
	}
	public static void main(String [] args)
	{
		new Paint();
		
	}
}