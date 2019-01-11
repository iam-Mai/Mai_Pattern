/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 2 : The Decorator Pattern
 */

public class Store {
	public static void main(String args[]) 
    { 
		CondimentFactory condiment = CondimentFactory.getInstance();
		Register register = new Register(condiment);
    } 
}
