package WithStrategyPattern;

import strategy.SpecialDriveStrategy;

public class SportVehicle extends Vehicle {

	SportVehicle(){
		super(new SpecialDriveStrategy());
	}
}
