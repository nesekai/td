package td.Engine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class Surface extends JPanel {
	Window window;
	
	public Surface(Window win) {
		window = win;
	}

	public void doDrawing(Graphics g) {
		
		window.setGraphics2D((Graphics2D)g);
		window.getKernel().getEvent().getCurrent().render();		
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}