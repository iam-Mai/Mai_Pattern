/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class DimmerLightOffCommand implements Command {
	Light light;
	int prevLevel;

	public DimmerLightOffCommand (Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
 
	public void undo() {
		light.on();
	}
}
