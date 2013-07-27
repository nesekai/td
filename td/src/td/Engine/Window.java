package td.Engine;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	Surface surface;
	Graphics2D g2d;
	Kernel kernel;

	public Kernel getKernel() {
		return kernel;
	}

	public Window(Kernel pKernel) {
		kernel = pKernel; 		
        initUI();
        
    }
    
	public void setGraphics2D(Graphics2D g) {
		g2d = g;
	}

	public Graphics2D getGraphics2D() {
		return g2d;
	}
	
	private void initUI() {
        
        setTitle("TD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(512, 512);
        setLocationRelativeTo(null);
        
        surface = new Surface(this);
        add(surface);
        
    }
    
    public void rePrint() {
        surface.repaint();
    }
}
