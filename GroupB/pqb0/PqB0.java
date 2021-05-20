import java.awt.*;
import java.applet.*;

/*public class PqB0 extends Applet
{
	int x=100,y=100;
	public void paint(Graphics g)
	{
		for(int i=1;i<=4;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				g.drawString("*",x,y);
				x=x+40;
			}
		
			
			y+=20;
			x=y;
		}

	}
}*/
public class PqB0 extends Applet
{
	int x=100,y=160;
	public void paint(Graphics g)
	{
		for(int i=0;i<4;i++)
		{
			int l=x;
			for(int k=0;k<4-i;k++)
			{
				g.drawString("*",x,y);
				x=x+40;
			}
		
			
			y-=20;
			x=l+20;
		}

	}
}