/*
 * Developer: Sasithorn Hannarong
 * Assignment: Pattern Assignment 4 : The Command Pattern
 */

import java.util.*;

public class TestCommand {
		static Command[] startClassCommands;
		static Command[] endClassCommands;
		
		
		public static void main(String[] args) {
			RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
			
			//Set up light command
			Light classRoomLight = new Light("Class Room");
			DimmerLightDimLightCommand classRoomLightDim = new DimmerLightDimLightCommand(classRoomLight);
			DimmerLightFullLightCommand classRoomFullLight = new DimmerLightFullLightCommand(classRoomLight);
			
			//Set up screen command
			Screen screen = new Screen ("Class Room");
			ScreenDropCommand screenDrop = new ScreenDropCommand(screen);
			ScreenRaiseCommand screenRaise = new ScreenRaiseCommand(screen);
			
			//Set up projector command
			Projector projector = new Projector ("Class Room");
			ProjectorOnCommand projectorOn = new ProjectorOnCommand(projector);
			ProjectorOffCommand projectorOff = new ProjectorOffCommand(projector);

			startClassCommands = new Command[] { classRoomLightDim, screenRaise, projectorOn};
			endClassCommands = new Command[] { classRoomFullLight, screenDrop, projectorOff};

			MacroCommand startClass = new MacroCommand(startClassCommands);
			MacroCommand endClass = new MacroCommand(endClassCommands);
			
			
			remoteControl.setCommand(0, startClass, endClass);
			System.out.println(remoteControl);
			
			System.out.println("\n------- pushing Start Class button -------");
			remoteControl.onButtonWasPushed(0);
			
			System.out.println("\n------- pushing End Class button -------");
			remoteControl.offButtonWasPushed(0);
			
			
		}
}
