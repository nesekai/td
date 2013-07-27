package td;

import javax.swing.JFrame;

public class Window extends JFrame{
	
    public Window() {

        initUI();
    }

    private void initUI() {
        
        setTitle("TD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(512, 512);
        setLocationRelativeTo(null);
    }
}
