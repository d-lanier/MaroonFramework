package com.team766.frc2020;

import com.team766.framework.AutonomousProcedure;
import com.team766.frc2020.procedures.*;

public enum AutonomousModes {
	@AutonomousProcedure(procedureClass = Launch.class)
	Launch,
	@AutonomousProcedure(procedureClass = DriveSquare.class)
	DriveSquare,
	@AutonomousProcedure(procedureClass = DriveStraight.class)
	DriveStraight,
	@AutonomousProcedure(procedureClass = TurnRight.class)
	TurnRight
}
