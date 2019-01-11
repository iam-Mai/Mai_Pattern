/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 3 : The Iterator Pattern
 */

import java.util.*;

public class StarbuzzMenu {
	Hashtable menuItems;
	int key = 0; 
	public StarbuzzMenu() {
		menuItems = new Hashtable();
    
		addItem("Dark Roast", 
			"Fresh Dark Roast coffee, rich and pure taste", 
			true,
			0.99);
 
		addItem("Decaf", 
			"Non caffeine coffee", 
			true,
			1.05);
 
		addItem("Espresso",
			"Full-flavored, concentrated form of coffee that is served in shots",
			true,
			1.99);
 
		addItem("House Blend",
			"A blend of fine Latin American beans roasted to a glistening, dark chestnut color",
			true,
			0.89);
		
		addItem("Soy",
				"High quality and fresh soy milk",
				true,
				0.15);
		
		addItem("Steamed Milk",
				"100% fresh milk from farm",
				false,
				0.15);
		
		addItem("Sprinkles",
				"To decorate or to add texture to you favorite coffee ",
				true,
				0.10);
		
		addItem("Whip cream",
				"Homemade fresh whipped cream",
				false,
				0.10);
		
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(key, menuItem);
		key = key + 1;
	}
 
	public Hashtable getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new StarbuzzMenuIterator(menuItems);
	}
  
	public String toString() {
		return "Objectville Starbuzz Menu";
	}

	// other menu methods here
}
