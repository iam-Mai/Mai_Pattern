/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha" ;
	}
	
	public double cost () {
		return 0.20 + beverage.cost();
	}
}
