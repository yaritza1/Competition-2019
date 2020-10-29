/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ArmForward;
import frc.robot.commands.ArmReverse;
import frc.robot.commands.HighGear;
import frc.robot.commands.IntakePistonClose;
import frc.robot.commands.IntakePistonOpen;
import frc.robot.commands.LowGear;
import frc.robot.commands.RampOff;
import frc.robot.commands.RampOn;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick driver = new Joystick(0);
  public Joystick gunner = new Joystick(1);
  public Button Dabutton = new JoystickButton(driver, 1);
  public Button Dbbutton = new JoystickButton(driver, 2);
  public Button Gabutton = new JoystickButton(gunner,1);
  public Button Gbbutton = new JoystickButton(gunner, 2);
  public Button Dstartbutton = new JoystickButton(driver, 8);
  public Button Dmenubutton = new JoystickButton(driver, 7);
  public Button Grightbumper = new JoystickButton(gunner, 5);
  public Button Gleftbumper = new JoystickButton(gunner, 6);
  public OI(){
    Dabutton.whenPressed(new HighGear());
    Dbbutton.whenPressed(new LowGear());
    Gabutton.whenPressed(new ArmReverse());
    Gbbutton.whenPressed(new ArmForward());
    Dstartbutton.whenPressed(new RampOn());
    Dmenubutton.whenPressed(new RampOff());
    Grightbumper.whenPressed(new IntakePistonClose());
    Gleftbumper.whenPressed(new IntakePistonOpen());

    
  }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
