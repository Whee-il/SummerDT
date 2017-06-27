package org.usfirst.frc.team1160.robot.commands;

import org.usfirst.frc.team1160.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ManualDrive extends Command{
	
	public ManualDrive(){
		requires(Robot.dt);
	}
	
	protected void initialize() {
		//Robot.dt.setManual();
		System.out.println("DT set to regular speed");
	}

	protected void execute() {
		Robot.dt.manualDrive();
	}

	protected boolean isFinished() {
		return false;
	}

	

}
