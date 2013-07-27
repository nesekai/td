package td.Engine;

import java.util.Iterator;
import java.util.LinkedList;

import td.Menu;

public class Event {
	LinkedList <BCore> list;

	public Event(){
		list = new LinkedList<BCore>();
	}

	
	public void add(BCore event){
		
		list.add(event);
		
	}
	
	public void run(){
		Iterator iterator;

		iterator = list.iterator();
		while (iterator.hasNext())
		{
			BCore tmp = ((BCore)iterator.next());
			tmp.update();
			tmp.render();
		}
	}
}
