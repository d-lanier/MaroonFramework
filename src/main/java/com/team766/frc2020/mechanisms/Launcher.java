package com.team766.frc2020.mechanisms;
 
import com.team766.framework.Mechanism;
import com.team766.hal.RobotProvider;
import com.team766.hal.SolenoidController;
 
public class Launcher extends Mechanism {
	private SolenoidController m_pusher;
 
	public Launcher() {
		m_pusher = RobotProvider.instance.getSolenoid("launch");
	}
 
	public void setPusher(boolean extended) {
		checkContextOwnership();
 
		m_pusher.set(extended);
	}
}
