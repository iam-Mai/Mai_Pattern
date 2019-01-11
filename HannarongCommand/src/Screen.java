/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class Screen {
	String location;
	String  status;
	
	public Screen(String location) {
		this.location = location;
		status = "Raise";
	}
	
	public void Drop () {
		status = "Drop";
		//perform dropping screen
		System.out.println(location + " screen is dropped");
	}
	
	public void Raise () {
		status = "Raise";
		//perform raising screen
		System.out.println(location + " screen is raised");
		
	}
	
}
