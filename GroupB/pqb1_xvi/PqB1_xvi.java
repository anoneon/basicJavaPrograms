import java.awt.*;
import java.applet.*;

public class PqB1_xvi extends Applet
{
	int x,y,w,h;

	public void paint(Graphics g)
	{	
		x=10;
		y=10;
		w=10;
		h=10;
		for(int i=1;i<=5;i++)
		{
			
			
				if(i%2==0)
					g.fillOval(x,y,w,h);
				else
					g.drawOval(x,y,w,h);
			
			
			y+=20;
		}

	}
}