import java.awt.*;
import java.applet.*;

public class PqB8 extends Applet
{
	int x,y,w,h;

	public void paint(Graphics g)
	{	
		y=10;
		w=10;
		h=10;
		for(int i=0;i<3;i++)
		{
			x=10;
			for(int j=0;j<3;j++)
			{
				if(i+j==1||i+j==3)
					g.fillOval(x,y,w,h);
				else
					g.drawOval(x,y,w,h);
				x+=20;
			}
			y+=20;
		}

	}
}