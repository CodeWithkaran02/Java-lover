import java.applet.Applet;
import java.awt.*;
class ParameterApplet2
{
	public void init()
	{
		
	}
	public void point(Graphics g)
	{
		String str = getParameter("nm");
		g.drawString("this is a Parameter applet",200,200);
		g.setfont(new font("Monotype coursive ",Font.ITALIC,100));
		g.setColor(Color.green);
		g.drawString(str,200,300);
		g.drawString(str,200,300);
	}
}