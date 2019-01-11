/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class DimmerLightOnCommand implements Command {
	Light light;
	int prevLevel;
	
	public DimmerLightOnCommand (Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
 
	public void undo() {
		light.off();
	}
	
}
