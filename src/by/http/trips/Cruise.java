package by.http.trips;

import by.http.food.Food;
import by.http.transport.Transport;

public class Cruise extends Rest {

	private int portsCount;

	// constructor
	public Cruise(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount,
			int portsCount) {
		super(tripDuration, food, transport, serviceCost, citiesCount);
		this.portsCount = portsCount;
	}

	@Override
	public String printTrip() {
		// TODO Auto-generated method stub
		return "cruise on board of " + this.getAllTransportDisplay() + "with food " + this.getFoodTime()
				+ "times to eat, duration - " + this.getTripDuration() + " days";

	}

}
