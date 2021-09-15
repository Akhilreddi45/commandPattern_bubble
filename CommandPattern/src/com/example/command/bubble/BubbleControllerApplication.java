package com.example.command.bubble;

public class BubbleControllerApplication {

	public static void main(String[] args) {

		BubbleController controller = new BubbleController();

		LargeBubbleCircleMachine largeCircleMachine = new LargeBubbleCircleMachine();
		LargeBubbleCircleMachineStartCommand lcStartCommand = new LargeBubbleCircleMachineStartCommand(
				largeCircleMachine);
		LargeBubbleCircleMachineStopCommand lcStopCommand = new LargeBubbleCircleMachineStopCommand(largeCircleMachine);
		LargeBubbleCircleMachineBlowCommand lcBlowCommand = new LargeBubbleCircleMachineBlowCommand(largeCircleMachine);

		SmallBubbleCircleMachine smallBubbleCircleMachine = new SmallBubbleCircleMachine();
		SmallBubbleCircleMachineStartCommand scStartCommand = new SmallBubbleCircleMachineStartCommand(
				smallBubbleCircleMachine);
		SmallBubbleCircleMachineStopCommand scStopCommand = new SmallBubbleCircleMachineStopCommand(
				smallBubbleCircleMachine);
		SmallBubbleCircleMachineBlowCommand scBlowCommand = new SmallBubbleCircleMachineBlowCommand(
				smallBubbleCircleMachine);

		controller.setCommand(lcStartCommand);
		controller.processCommand();
		controller.setCommand(lcBlowCommand);
		controller.processCommand();
		controller.setCommand(lcStopCommand);
		controller.processCommand();

		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		controller.setCommand(scStartCommand);
		controller.processCommand();
		controller.setCommand(scBlowCommand);
		controller.processCommand();
		controller.setCommand(scStopCommand);
		controller.processCommand();

	}

}
