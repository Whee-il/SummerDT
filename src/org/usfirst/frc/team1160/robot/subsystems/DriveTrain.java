package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.OI;
import org.usfirst.frc.team1160.robot.RobotMap;
import org.usfirst.frc.team1160.robot.commands.ManualDrive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem implements RobotMap{
	public static DriveTrain instance;
	private Talon frontLeft, frontRight, backLeft, backRight;
    
	public static DriveTrain getInstance(){
		if (instance == null){
			instance = new DriveTrain();
		}
		return instance;
	}
	
	private DriveTrain(){
		frontLeft  = new Talon(DT_FRONTLEFT);
		backLeft = new Talon(DT_BACKLEFT);
		frontRight = new Talon(DT_FRONTRIGHT);
		backRight = new Talon(DT_BACKRIGHT);
	
	}
	
	public void manualDrive(){
		frontLeft.set((OI.getInstance().getStick().getY()) - (OI.getInstance().getStick().getZ()));
		backLeft.set((OI.getInstance().getStick().getY()) - (OI.getInstance().getStick().getZ()));
		frontRight.set((OI.getInstance().getStick().getY()) + (OI.getInstance().getStick().getZ()));
		backRight.set((OI.getInstance().getStick().getY()) + (OI.getInstance().getStick().getZ()));
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new ManualDrive());
    }
}

