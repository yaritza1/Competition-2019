/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.IntakeMotorCommand;

/**
 * Add your docs here.
 */
public class TriggerValues extends Subsystem {
  double rightTrigger, leftTrigger, triggerValue;

  public double Trigger(){
  rightTrigger = Robot.m_oi.gunner.getRawAxis(3)*-1;
  leftTrigger = Robot.m_oi.gunner.getRawAxis(2);
  triggerValue = leftTrigger + rightTrigger;
  return triggerValue * Math.abs(triggerValue);
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
