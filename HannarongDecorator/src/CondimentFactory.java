/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class CondimentFactory {
	private static CondimentFactory instance = null; 
	  
    private CondimentFactory() 
    { 
    	//Do something
    } 
  
    public static synchronized CondimentFactory getInstance() 
    { 
        if (instance == null)  {
        	System.out.println("Constructing CondimentFactory"); 
        	instance = new CondimentFactory(); 
        } else {
        	System.out.println("CondimentFactory already exists"); 
        }
  
        return instance; 
    } 
    
    public static Beverage addCondiment (Beverage beverage, String text) {
		if (text.toLowerCase().compareTo("mocha") == 0 ) {
			beverage = new Mocha (beverage);
		} else if (text.toLowerCase().compareTo("soy") == 0) {
			beverage = new Soy(beverage);
		}  else if (text.toLowerCase().compareTo("steamedmilk") == 0) {
			beverage = new SteamedMilk(beverage);
		}  else if (text.toLowerCase().compareTo("whip") == 0) {
			beverage = new Whip(beverage);
		}   else if (text.toLowerCase().compareTo("sprinkles") == 0) {
			beverage = new Sprinkles(beverage);
		} 
		return beverage;
	}
}
