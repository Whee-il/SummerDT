package org.usfirst.frc.team1160.robot.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

    public static Intake instance;
    private Jaguar left, right;

    private Intake(){
    	left = new Jaguar(5);
    	right = new Jaguar(4);
    }
	
    public static Intake getInstance(){
    	if(instance == null){
    		instance = new  Intake();
    	}
    	return instance;
    }
    
    public void inTake(){
    	left.set(1);
    	right.set(1);
    }
	
    public void outTake(){
    	left.set(-1);
    	right.set(-1);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

