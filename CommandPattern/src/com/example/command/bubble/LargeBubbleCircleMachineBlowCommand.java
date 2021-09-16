package com.example.command.bubble;
/**
* Blow Command
*/
public class LargeBubbleCircleMachineBlowCommand implements Command {

	LargeBubbleCircleMachine machine;

	public LargeBubbleCircleMachineBlowCommand(LargeBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.blow();
		return "LargeBubbleCircleMachineBlowCommand";
	}

}
