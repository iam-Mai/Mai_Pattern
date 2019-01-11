/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class ScreenRaiseCommand implements Command {
	Screen screen;
	String prevStatus;
	
	public ScreenRaiseCommand(Screen screen) {
		this.screen = screen;
	}
 
	public void execute() {
		prevStatus = screen.status;
		screen.Raise();
	}
 
	public void undo() {
		screen.Drop();
	}
}
