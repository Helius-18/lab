import java.applet.Applet; 
import java.awt.Graphics;

/*<applet code="Message.class" width=400 height=300></applet>*/
public class Message extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello world",150,100);
	}
}
