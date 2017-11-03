package by.http.transport;

public abstract class Transport {

	private String name;
	private int transferCost;

	// constructor
	public Transport(String name, int transferCost) {
		this.name = name;
		this.transferCost = transferCost;
	}

	public void setTransferCost(int transferCost) {
		this.transferCost = transferCost;
	}

	public int getCost() {
		return transferCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
