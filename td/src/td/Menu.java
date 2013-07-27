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
		getKernel().getText().Draw(40, 40, this.toString());
	}
	
}
