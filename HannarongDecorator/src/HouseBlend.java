/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class HouseBlend extends Beverage{
	public HouseBlend () {
		description = "House Blend coffee";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
}
