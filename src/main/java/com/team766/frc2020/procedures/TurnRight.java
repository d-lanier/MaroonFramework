package com.team766.frc2020.procedures;

import com.team766.framework.Context;
import com.team766.frc2020.Robot;
import com.team766.framework.Procedure;

public class TurnRight extends Procedure {

	public void run(Context context) {
		context.takeOwnership(Robot.drive);
		
		Robot.drive.setDrivePower(0.25, -0.25);

		context.waitForSeconds(1.0);

		Robot.drive.setDrivePower(0.0, 0.0);

	}

}