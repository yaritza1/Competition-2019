/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static WPI_TalonSRX frontRight = new WPI_TalonSRX(4);
  public static WPI_TalonSRX backRight = new WPI_TalonSRX(5);
  public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(6);
  public static WPI_TalonSRX backLeft = new WPI_TalonSRX(7);
  public static SpeedControllerGroup leftWheels =  new SpeedControllerGroup(frontLeft, backLeft);
  public static SpeedControllerGroup rightWheels = new SpeedControllerGroup(frontRight, backRight);
  public static DifferentialDrive drivetrain = new DifferentialDrive(leftWheels, rightWheels);
  public static WPI_TalonSRX rightIntake = new WPI_TalonSRX(1);
  public static WPI_TalonSRX leftIntake = new WPI_TalonSRX(2);
  public static WPI_TalonSRX armMotor = new WPI_TalonSRX(8);
  public static Solenoid gearbox = new Solenoid(0);
  public static Solenoid ramp = new Solenoid(1);
  public static Solenoid intakepiston = new Solenoid(2);
  public static Solenoid hatchlevel = new Solenoid(3);
  public static DoubleSolenoid arm = new DoubleSolenoid(4, 5);
  public static Compressor compressor = new Compressor();
  public static UsbCamera camera = CameraServer.getInstance().startAutomaticCapture(0);
  public static UsbCamera camera2 = CameraServer.getInstance().startAutomaticCapture(1);

  

  
  

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
