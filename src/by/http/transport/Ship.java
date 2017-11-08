package by.http.transport;

public class Ship extends Transport {

	private int cabinCount;

	// constructor
	public Ship(String name, int transferCost, int cabinCount) {
		super(name, transferCost);
		this.cabinCount = cabinCount;
	}

}
