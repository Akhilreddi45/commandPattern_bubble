package com.example.command.bubble;
/**
* Start Command
*/
public class LargeBubbleCircleMachineStartCommand implements Command {

	LargeBubbleCircleMachine machine;

	public LargeBubbleCircleMachineStartCommand(LargeBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "LargeBubbleCircleMachineStartCommand";
	}

}
