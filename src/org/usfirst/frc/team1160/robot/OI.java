package org.usfirst.frc.team1160.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1160.robot.commands.ExampleCommand;
import org.usfirst.frc.team1160.robot.commands.Intake.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick mainStick;
	public JoystickButton inTake, outTake;
	public static OI instance;
	
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
		}
		return instance;
	}
	
	public OI(){
		mainStick = new Joystick(0);
		
		createButtons();
	}
	
	public void createButtons(){
		inTake = new JoystickButton(mainStick,4);
		outTake = new JoystickButton(mainStick,3);
		
		tieButtons();
	}
	
	public void tieButtons(){
		inTake.whenPressed(new inTake());
		outTake.whenPressed(new outTake());
		
	}
	
	public Joystick getStick(){
		return mainStick; 
	
	}
	
}
