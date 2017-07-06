package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.OI;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    public static DriveTrain instance;
    private Jaguar frontLeft, frontRight, backLeft, backRight;
    

    private DriveTrain(){
    	frontLeft = new Jaguar(1);
    	frontRight = new Jaguar(2);
    	backLeft = new Jaguar(3);
    	backRight = new Jaguar(4  );
    
    }
    public void setAuto(){
    	
    }
    
	public void setManual(){

		System.out.println("DT set to Manual" );
	}
    
    public void manualDrive(){
    	frontLeft.set(OI.getInstance().getStick().getZ() - OI.getInstance().getStick().getY());
    	backLeft.set(OI.getInstance().getStick().getZ() - OI.getInstance().getStick().getY());
    	frontRight.set(OI.getInstance().getStick().getZ() + OI.getInstance().getStick().getY());
    	backRight.set(OI.getInstance().getStick().getZ() + OI.getInstance().getStick().getY());
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	}
    public static DriveTrain getInstance(){
    	if(instance == null)
    		instance = new DriveTrain();
    	return instance; 
    }
}

