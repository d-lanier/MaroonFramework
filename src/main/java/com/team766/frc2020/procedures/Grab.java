package com.team766.frc2020.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.frc2020.Robot;

public class Grab extends Procedure{
	
	public void run(Context context){
		context.takeOwnership(Robot.arms);

		Robot.arms.setArmsPower(0.25, 0.25);

		context.waitForSeconds(3.0);

		Robot.arms.setArmsPower(0.0, 0.0);
	}
}