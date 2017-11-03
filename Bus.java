package by.http.transport;

public class Bus extends Transport {

	private int placeCount;
	private int stopCount;

	// constructor
	public Bus(String name, int transferCost, int placeCount, int stopCount) {
		super(name, transferCost);
		this.placeCount = placeCount;
		this.stopCount = stopCount;
	}

	@Override
	public void reachDestination() {
		System.out.println("Our buses are the most comfortable buses in the world!");

	}

}
