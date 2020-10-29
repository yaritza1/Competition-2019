/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveTrainCommand;

/**
 * Add your docs here.
 */
public class DriveTrainSubsystem extends Subsystem {
  DifferentialDrive drivetrain;
  
 
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public DriveTrainSubsystem(){
  
  drivetrain = RobotMap.drivetrain;
  
 

  }
  public void arcadeDrive(double x, double y){
    drivetrain.arcadeDrive(-x,y);
  }
  


  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveTrainCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
