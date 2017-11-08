package by.http.trips;

import by.http.food.Food;
import by.http.transport.Transport;

public abstract class Rest extends Trip {

	private int citiesCount;

	// constructor
	public Rest(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount) {
		super(tripDuration, food, transport, serviceCost);
		this.citiesCount = citiesCount;
	}

}