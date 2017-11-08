package by.http.trips;

import by.http.food.Food;
import by.http.transport.Transport;

public class Excursion extends Rest {

	private String emotion;

	// constructor
	public Excursion(int tripDuration, Food[] food, Transport[] transport, int serviceCost, int citiesCount,
			String emotion) {
		super(tripDuration, food, transport, serviceCost, citiesCount);
		this.emotion = emotion;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}

	@Override
	public String printTrip() {
		// TODO Auto-generated method stub

		return this.emotion + " excursion using " + this.getAllTransportDisplay() + "with food " + this.getFoodTime()
				+ "times to eat, duration - " + this.getTripDuration() + " days";
	}

}
