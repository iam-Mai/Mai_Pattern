/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class ScreenDropCommand implements Command {
	Screen screen;
	String prevStatus;
	
	public ScreenDropCommand(Screen screen) {
		this.screen = screen;
	}
 
	public void execute() {
		prevStatus = screen.status;
		screen.Drop();
	}
 
	public void undo() {
		screen.Raise();
	}
}
