/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}
