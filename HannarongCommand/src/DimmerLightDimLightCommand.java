/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

public class DimmerLightDimLightCommand implements Command{
	Light light;
	int prevLevel;
	
	public DimmerLightDimLightCommand (Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.dim(60);
	}
 
	public void undo() {
		light.dim(prevLevel);
	}
}
