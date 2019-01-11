/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class Sprinkles extends CondimentDecorator{
	Beverage beverage;
	public Sprinkles (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Sprinkles";
	}
	
	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
