/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class ProjectorOnCommand implements Command{
	Projector projector;
	String prevStatus;
	
	public ProjectorOnCommand(Projector projector) {
		this.projector = projector;
	}
 
	public void execute() {
		prevStatus = projector.status;
		projector.on();
	}
 
	public void undo() {
		projector.off();
	}
}
