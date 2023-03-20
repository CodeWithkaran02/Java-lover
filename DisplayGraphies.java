import java.awt.*;
import javax.swing.JFrame;
class DisplayGraphies extends Canvas
{
	public  void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.drawString("HEELO",40,40);
		setBackground(Color.BLUE);
		g.fillRect(130,30,100,80);
		g.drawOval(30,130,50,60);
		g.setColor(Color.RED);
		g.fillOval(130,130,50,60);
		g.drawArc(30,200,46,50,90,60);
		g.setFont(new Font("Arial",Font.ITALIC,300));
		g.drawString("WELCOME",40,140);
		
	}
	public static void main (String str[])
	{
		DisplayGraphies dg = new DisplayGraphies();
		JFrame f = new JFrame ();
		f.add(dg);
		f.setSize(400,400);
		f.setVisible(true);
		
	}
}