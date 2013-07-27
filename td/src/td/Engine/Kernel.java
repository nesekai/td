package td.Engine;

import td.Menu;

public class Kernel {
	
	Window win;
	Event event;

	public Window getWindow() {
		return win;
	}

	public Event getEvent() {
		return event;
	}

	public void run(){
    	while(true)
    	{
    		event.run();
			win.rePrint();
    	}
	}
	
	public Kernel(){
		
    	win = new Window();
    	event = new Event();

	}
	
}
