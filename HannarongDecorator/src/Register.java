/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

import java.util.Scanner;
public class Register {
	private Scanner s;
	public static Beverage newSale(String text) {
		Beverage beverage = null;
		if (text.toLowerCase().compareTo("darkroast") == 0) {
			beverage = new DarkRoast();
		} else if (text.toLowerCase().compareTo("houseblend") == 0) {
			beverage = new HouseBlend();
		}  else if (text.toLowerCase().compareTo("decaf") == 0) {
			beverage = new Decaf();
		}  else if (text.toLowerCase().compareTo("espresso") == 0) {
			beverage = new Espresso();
		} 
		return beverage;
	}
	
	public Register(CondimentFactory condiment) 
    { 
		System.out.println ("Please make new order: ");
		s = new Scanner(System.in); 
		String text= s.nextLine();
				
		if (text.toLowerCase().compareTo("new sale") == 0) {
			text= s.nextLine();
			Beverage beverage = newSale(text);
			
			text= s.nextLine();
			while (text.toLowerCase().compareTo("end sale") != 0 ) {
				beverage = CondimentFactory.addCondiment (beverage, text);
				text= s.nextLine();
			}
			System.out.println(beverage.getDescription() + " $" + beverage.cost());
		}
    }
}
