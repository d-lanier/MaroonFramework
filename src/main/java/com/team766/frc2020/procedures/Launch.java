package com.team766.frc2020.procedures;

import com.team766.framework.Context;
import com.team766.framework.Procedure;
import com.team766.frc2020.Robot;

public class Launch extends Procedure {
	public void run(Context context) {
		context.takeOwnership(Robot.launcher);

		log("Launching ball");
		Robot.launcher.setPlunger(true);
		context.waitForSeconds(0.5);
		Robot.launcher.setPlunger(false);
	}
}
