import java.awt.*;
import java.applet.*;

public class PqB1_v extends Applet
{
	int x,y,w,h;

	public void paint(Graphics g)
	{
		x=10;
		y=10;
		w=100;
		h=60;
		for(int i=0;i<4;i++)
		{
			
		
			g.drawRect(x,y,w,h);	
			
			x+=5;
			y+=5;
			w-=10;
			h-=10;
		}

	}
}