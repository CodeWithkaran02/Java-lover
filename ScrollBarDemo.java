import java.awt.*;
import java.awt.event.*;
class ScrollBarDemo extends Frame implements AdjustmentListener
{
	Label msg = new Label();
	Scrollbar hs = new Scrollbar(Scrollbar.HORIZONTAL,0,60,0,300);
	Scrollbar vs = new Scrollbar(Scrollbar.VERTICAL,0,30,0,300);
	
	public ScrollBarDemo()
	{
		setSize(200,250);
		hs.addAdjustmentListener(this);
		vs.addAdjustmentListener(this);
		setLayout(new BorderLayout());
		add(hs,BorderLayout.SOUTH);
		add(vs,BorderLayout.EAST);
		add(msg,BorderLayout.CENTER);
		setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		msg.setText("Horizental:"+hs.getValue()+",Vertical:"+vs.getValue());
	}
	public static void main(String [] args)
	{
		new ScrollBarDemo();
	}
}
