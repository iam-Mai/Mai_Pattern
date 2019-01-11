/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class DimmerLightFullLightCommand implements Command {
	Light light;
	int prevLevel;
	
	public DimmerLightFullLightCommand (Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.dim(100);
	}
 
	public void undo() {
		light.dim(prevLevel);
	}
	
}
