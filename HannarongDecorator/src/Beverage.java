/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public abstract class Beverage {
	String description = "unknow beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}