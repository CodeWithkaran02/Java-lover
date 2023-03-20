import java.applet.Applet;
import java.awt.*;
class ParamitraApplet extends Applet 
{
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		String str = getParameter("nm");
		g.drawString("this is  a Parameter Applet ",200,200);
		g.drawString(str,200,300);
		
	}
}