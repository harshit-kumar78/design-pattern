package WithStrategyPattern;

import strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

	PassengerVehicle(){
		super(new NormalDriveStrategy());
	}
}
