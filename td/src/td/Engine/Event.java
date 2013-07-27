package td.Engine;

import java.util.Iterator;
import java.util.LinkedList;

import td.Menu;

public class Event {
	LinkedList <BCore> list;
	BCore current;

	public Event(){
		list = new LinkedList<BCore>();
	}

	
	public void add(BCore event){
		
		list.add(event);
		
	}
	
	public void setCurrent(String name){
		Iterator iterator;
		iterator = list.iterator();
		while (iterator.hasNext())
		{
			BCore tmp = ((BCore)iterator.next());
			if( name.compareTo(tmp.toString()) == 0)
			{
				current = tmp;
				return;
			}
		}
	}
	
	public BCore getCurrent(){		
		return current;
	}
	
	public void run(){
		current.update();
		/*Iterator iterator;

		iterator = list.iterator();
		while (iterator.hasNext())
		{
			BCore tmp = ((BCore)iterator.next());
			tmp.update();
			tmp.render();
		}*/
	}
}
