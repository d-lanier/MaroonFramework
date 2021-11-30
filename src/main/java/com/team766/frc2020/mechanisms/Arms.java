package com.team766.frc2020.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SpeedController;

public class Arms extends Mechanism{
	private SpeedController m_leftServo;
	private SpeedController m_rightServo;
	
	public Arms(){
		m_leftServo = RobotProvider.instance.getMotor("arms.leftServo");
		m_rightServo = RobotProvider.instance.getMotor("arms.rightServo");
	}

	public void setArmsPower(double leftPower, double rightPower) {
		checkContextOwnership();

		m_leftServo.set(leftPower);
		m_rightServo.set(rightPower);
	}
}