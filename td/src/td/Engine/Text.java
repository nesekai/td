package td.Engine;

import java.awt.Graphics2D;

public class Text {
	
	private Kernel kernel;
	
	public Text(Kernel pKernel){
		kernel = pKernel;
	}
	public Kernel getKernel() {
		return kernel;
	}
	public void Draw(int x, int y, String szoveg) {
		Graphics2D g2d = (Graphics2D) getKernel().getWindow().getGraphics2D();
	    g2d.drawString(szoveg, x, y);
	
	}
}
