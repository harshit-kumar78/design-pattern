package WithStrategyPattern;

import strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
	
	OffRoadVehicle(){
		super(new SpecialDriveStrategy());
	}
	

}
