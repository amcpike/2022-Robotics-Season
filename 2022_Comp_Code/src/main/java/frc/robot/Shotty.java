// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.Timer;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  
  private CANSparkMax shotMotor  = new CANSparkMax(30, MotorType.kBrushless);
  private Timer autonTimer;
  
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
    boolean controlling = false;
    boolean shooter = false; 
    autonTimer.reset();
  }

  @Override
  public void autonomousPeriodic() {
    if (autonTimer.hasElapsed(5.0)) {
      shotMotor.set(.25);
    }
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
 
    boolean controlling = true;
    boolean shooter = false;

     {
        
        if (shooter = true) {
        shotMotor.set(.25);
        }

    }
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

public static int getAutoModes() {
    return 0;
}
}
