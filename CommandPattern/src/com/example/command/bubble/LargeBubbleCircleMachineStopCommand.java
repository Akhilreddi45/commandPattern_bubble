package com.example.command.bubble;
/**
* stop Command
*/
public class LargeBubbleCircleMachineStopCommand implements Command {

	LargeBubbleCircleMachine machine;

	public LargeBubbleCircleMachineStopCommand(LargeBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.stop();
		return "LargeBubbleCircleMachineStopCommand";
	}

}
