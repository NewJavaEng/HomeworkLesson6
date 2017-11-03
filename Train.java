package by.http.transport;

public class Train extends Transport {

	private int compartmentCount;

	// constructor
	public Train(String name, int transferCost, int compartmentCount) {
		super(name, transferCost);
		this.compartmentCount = compartmentCount;
	}

	@Override
	public void reachDestination() {
		System.out.println("You will see lots of picturesque landscapes while travelling by train!");

	}

}
