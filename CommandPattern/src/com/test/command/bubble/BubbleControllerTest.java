package com.test.command.bubble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.command.bubble.BubbleController;
import com.example.command.bubble.LargeBubbleCircleMachine;
import com.example.command.bubble.LargeBubbleCircleMachineBlowCommand;
import com.example.command.bubble.LargeBubbleCircleMachineStartCommand;
import com.example.command.bubble.LargeBubbleCircleMachineStopCommand;
import com.example.command.bubble.SmallBubbleCircleMachine;
import com.example.command.bubble.SmallBubbleCircleMachineBlowCommand;
import com.example.command.bubble.SmallBubbleCircleMachineStartCommand;
import com.example.command.bubble.SmallBubbleCircleMachineStopCommand;

class BubbleControllerTest {

	LargeBubbleCircleMachine largeBubbleCircleMachine;
	SmallBubbleCircleMachine smallBubbleCircleMachine;
	LargeBubbleCircleMachineStartCommand lcStartCommand;
	LargeBubbleCircleMachineStopCommand lcStopCommand;
	LargeBubbleCircleMachineBlowCommand lcBlowCommand;

	
	SmallBubbleCircleMachineStartCommand scStartCommand;
	SmallBubbleCircleMachineStopCommand scStopCommand;
	SmallBubbleCircleMachineBlowCommand scBlowCommand;


	@BeforeEach
	public void setup() {
		largeBubbleCircleMachine = new LargeBubbleCircleMachine();
		smallBubbleCircleMachine = new SmallBubbleCircleMachine();

		lcStartCommand = new LargeBubbleCircleMachineStartCommand(largeBubbleCircleMachine);
		lcStopCommand = new LargeBubbleCircleMachineStopCommand(largeBubbleCircleMachine);
		lcBlowCommand = new LargeBubbleCircleMachineBlowCommand(largeBubbleCircleMachine);


		scStartCommand = new SmallBubbleCircleMachineStartCommand(smallBubbleCircleMachine);
		scStopCommand = new SmallBubbleCircleMachineStopCommand(smallBubbleCircleMachine);
		scBlowCommand = new SmallBubbleCircleMachineBlowCommand(smallBubbleCircleMachine);


	}

	@Test
	public void LargeCircleBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(lcStartCommand);

		String output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineStartCommand", output);

		controller.setCommand(lcBlowCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineBlowCommand", output);

		controller.setCommand(lcStopCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineStopCommand", output);

	}

	@Test
	public void SmallCircleBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(scStartCommand);

		String output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineStartCommand", output);

		controller.setCommand(scBlowCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineBlowCommand", output);

		controller.setCommand(scStopCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineStopCommand", output);

	}



}
