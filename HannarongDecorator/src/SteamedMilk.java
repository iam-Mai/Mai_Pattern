/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class SteamedMilk extends CondimentDecorator{
	Beverage beverage;
	
	public SteamedMilk (Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk" ;
	}
	
	public double cost () {
		return 0.10 + beverage.cost();
	}
}
