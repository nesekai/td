package td;

import td.Engine.BCore;
import td.Engine.Window;
import td.Engine.Event;
import td.Engine.Kernel;

public class Main {
	
    public static void main(String[] args) {
    	
    	System.out.println("Start");
    	Kernel kernel = new Kernel();
    	kernel.getWindow().setVisible(true);
    	kernel.getEvent().add(new Menu(kernel,"menu"));
    	kernel.getEvent().add(new Menu(kernel,"menu2"));
    	kernel.getEvent().setCurrent("menu2");
    	kernel.run();
    }
}