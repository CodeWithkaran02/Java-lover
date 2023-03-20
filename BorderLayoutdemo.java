import java.awt.*;
import java.awt.event.*;
class BorderLayoutdemo
{
 Frame f;
 Button btnEast,btnWest,btnNorth,btnSouth,btnCenter;
 BorderLayoutdemo()
 {
	 f= new Frame("BorderLayoutdemo");
	 btnEast= new Button("EAST");
	 btnWest= new Button("WEST");
	 btnNorth= new Button("NORTH");
	 btnSouth= new Button("SOUTH");
	 btnCenter= new Button("CENTER");
	 f.setSize(400,400);
	 f.setLayout(new BorderLayout());
	 f.add(btnEast,BorderLayout.EAST);
	 f.add(btnWest,BorderLayout.WEST);
	 f.add(btnNorth,BorderLayout.NORTH);
	 f.add(btnSouth,BorderLayout.SOUTH);
	 f.add(btnCenter,BorderLayout.CENTER);
	 f.setVisible(true);
	 
 }
 public static void main(String [] args)
 {
	 new BorderLayoutdemo();
 }
}