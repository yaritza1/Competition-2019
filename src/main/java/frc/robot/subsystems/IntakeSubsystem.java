/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeMotorCommand;

/**
 * Add your docs here.
 */
public class IntakeSubsystem extends Subsystem {
  WPI_TalonSRX rightIntake, leftIntake;

  public IntakeSubsystem(){
    rightIntake = RobotMap.rightIntake;
    leftIntake = RobotMap.leftIntake;
  }

  public void leftIntakeSet(double x){
    leftIntake.set(ControlMode.PercentOutput, x); //reverse the left side
  }

  public void rightIntakeSet(double x){
    rightIntake.set(ControlMode.PercentOutput, x);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new IntakeMotorCommand());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
