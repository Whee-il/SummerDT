package org.usfirst.frc.team1160.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team1160.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
/**
 *
 */
public class DannyIntake extends Subsystem implements RobotMap{

    public static DannyIntake instance;
    private Talon Left, Right;

    public static DannyIntake getInstance(){
		if(instance == null){
			instance = new DannyIntake();
		}
		return instance;
	}
    
    public DannyIntake(){
    	Left = new Talon(DK_LEFT);
    	Right = new Talon(DK_RIGHT);
    }
	
    public void Intake(){
		Left.set(1);
		Right.set(1);
	}
	public void Outtake(){
		Left.set(-1); 
		Right.set(-1);
	}
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

