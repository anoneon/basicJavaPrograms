import java.awt.*;
import java.applet.*;

public class PqB1_ii extends Applet
{
	int x,y,w,h;

	public void paint(Graphics g)
	{
		x=10;
		y=10;
		w=100;
		h=100;
		for(int i=0;i<3;i++)
		{
			
			if(i>0)
			{
				g.drawOval(x,y,w,h);
				x+=10;
				y+=10;
				w-=20;
				h-=20;
			}
			else
			{
				g.drawRect(x,y,w,h);	
			
				x+=5;
				y+=5;
				w-=10;
				h-=10;
			}
		}

	}
}