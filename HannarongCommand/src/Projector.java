/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class Projector {
	String location;
	String status;
	
	public Projector(String location) {
		this.location = location;
		status = "Off";
	}
	
	public void off () {
		status = "off";
		System.out.println("Projector is " + status);
	}
	
	public void on () {
		status = "on";
		System.out.println("Projector is " + status);
	}
	
}
