package by.http.trips;

import by.http.food.Food;
import by.http.transport.Transport;

public class Treatment extends Trip {

	private String resortName;

	// constructor
	public Treatment(int tripDuration, Food[] food, Transport[] transport, int serviceCost, String resortName) {
		super(tripDuration, food, transport, serviceCost);
		this.resortName = resortName;
	}

	@Override
	public String printTrip() {
		// TODO Auto-generated method stub
		return "treatment in " + this.resortName + " resort using " + this.getAllTransportDisplay() + "with food "
				+ this.getFoodTime() + "times to eat, duration - " + this.getTripDuration() + " days";

	}

}
