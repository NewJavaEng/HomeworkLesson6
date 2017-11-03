package by.http.transport;

public class Plane extends Transport {

	private int changeCount;

	// constructor
	public Plane(String name, int transferCost, int changeCount) {
		super(name, transferCost);
		this.changeCount = changeCount;
	}

	@Override
	public void reachDestination() {
		System.out.println("You will reach your destination on time!");

	}

}
