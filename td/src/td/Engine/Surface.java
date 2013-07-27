package td.Engine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class Surface extends JPanel {

	public Surface() {
	}

	public void doDrawing(Graphics g) {
		
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}