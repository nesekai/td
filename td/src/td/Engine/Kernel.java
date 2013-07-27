package td.Engine;

import td.Menu;

public class Kernel {
	
	Window win;
	Event event;
	Text text;

	public Window getWindow() {
		return win;
	}

	public Event getEvent() {
		return event;
	}

	public Text getText() {
		return text;
	}
	
	public void run(){
    	while(true)
    	{
    		event.run();
			win.rePrint();
    	}
	}
	
	public Kernel(){
		
    	win = new Window(this);
    	event = new Event();
    	text = new Text(this);

	}
	
}
