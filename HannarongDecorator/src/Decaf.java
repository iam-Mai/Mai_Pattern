/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf coffee";
	}
	
	public double cost() {
		return 1.05;
	}
}
