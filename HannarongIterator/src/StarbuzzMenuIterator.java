/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 3 : The Iterator Pattern
 */

import java.util.*;

public class StarbuzzMenuIterator implements Iterator {
	Hashtable items;
	int key = 0;
 
	public StarbuzzMenuIterator(Hashtable items) {
		this.items = items;
	}
 
	public Object next() {
		Object object = items.get(key);
		key = key + 1;
		return object;
	}
 
	public boolean hasNext() {
		if (key >= items.size() || items.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
