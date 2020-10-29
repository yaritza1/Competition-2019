/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.HighGear;

/**
 * Add your docs here.
 */
public class GearChange extends Subsystem {
  Solenoid gearbox;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public GearChange(){
    gearbox = RobotMap.gearbox;
  }
  public void Setgear(boolean x){
    
    gearbox.set(x);

  }
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new HighGear());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
