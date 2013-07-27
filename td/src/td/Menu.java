package td;

import java.awt.Graphics2D;

import td.Engine.*;

public class Menu extends BCore {

	int count;

	
	public Menu(Kernel pKernel, String pName)
	{
		super(pKernel,pName);
		count = 0;
	}
	
	public void update()
	{
	    count++;	
	}
	
	public void render()
	{
		Graphics2D g2d = (Graphics2D) getKernel().getWindow().getGraphics2D();
	    g2d.drawString(Integer.toString(count), count%512, count%512);
	}
	
}
