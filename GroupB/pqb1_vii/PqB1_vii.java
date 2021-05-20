import java.awt.*;
import java.applet.*;

public class PqB1_vii extends Applet
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
				if(i>1)
					g.fillOval(x,y,w,h);
				else
					g.drawOval(x,y,w,h);
				
			}		
			else
				g.drawRect(x,y,w,h);	
				
			x+=10;
			y+=10;
			w-=20;
			h-=20;			
			
			
		}

	}
}