package com.example.command.bubble;
/**
* stop Command
*/
public class SmallBubbleCircleMachineStopCommand implements Command {

	SmallBubbleCircleMachine machine;

	public SmallBubbleCircleMachineStopCommand(SmallBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.stop();
		return "SmallBubbleCircleMachineStopCommand";
	}

}
