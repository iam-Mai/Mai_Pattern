/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast coffee";
	}
	
	public double cost() {
		return 0.99;
	}
}
