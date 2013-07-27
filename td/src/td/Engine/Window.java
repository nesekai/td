package td.Engine;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	Surface surface;

	public Window() {

        initUI();
        
    }
    
    private void initUI() {
        
        setTitle("TD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(512, 512);
        setLocationRelativeTo(null);
        
        surface = new Surface();
        add(surface);
        
    }
    
    public void rePrint() {
        surface.repaint();
    }
}
