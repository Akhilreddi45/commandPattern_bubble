package com.example.command.bubble;
/**
* Command controller, this class is used to trigger command
*/
public class BubbleController {

	Command command;

	public BubbleController() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String processCommand() {
		return command.execute();
	}

}
