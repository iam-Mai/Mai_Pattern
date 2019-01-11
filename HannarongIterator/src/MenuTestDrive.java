//package headfirst.iterator.dinermerger;
/*
 * Edited: Sasithorn Hannarong
 * Assignment: Pattern Assignment 3 : The Iterator Pattern
 */

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        StarbuzzMenu starbuzzMenu = new StarbuzzMenu();
        
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, starbuzzMenu);
 
		waitress.printMenu();
	}
}
