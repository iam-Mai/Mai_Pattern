/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class ProjectorOffCommand implements Command{
	Projector projector;
	String prevStatus;
	
	public ProjectorOffCommand(Projector projector) {
		this.projector = projector;
	}
 
	public void execute() {
		prevStatus = projector.status;
		projector.off();
	}
 
	public void undo() {
		projector.on();
	}
}
