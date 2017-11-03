package by.http.trips;

import by.http.food.Food;
import by.http.transport.Transport;

public class Shopping extends Trip {

	private String cityName;

	// constructor
	public Shopping(int tripDuration, Food[] food, Transport[] transport, int serviceCost, String cityName) {
		super(tripDuration, food, transport, serviceCost);
		this.cityName = cityName;
	}

	@Override
	public String printTrip() {
		// TODO Auto-generated method stub
		return "shopping in " + this.cityName + " using " + this.getAllTransportDisplay() + "with food "
				+ this.getFoodTime() + "times to eat, duration - " + this.getTripDuration() + " days";

	}

}
