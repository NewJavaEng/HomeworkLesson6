package by.http.food;

public class Food {

	private boolean drinks;
	private int timesToEat;
	private boolean vegan;
	private int foodCost;

	// constructor
	public Food(boolean drinks, int timesToEat, boolean vegan, int foodCost) {
		this.drinks = drinks;
		this.vegan = vegan;
		this.timesToEat = timesToEat;
		this.foodCost = foodCost;
	}

	public int getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(int foodCost) {
		this.foodCost = foodCost;
	}

	public int getTimesToEat() {
		return timesToEat;
	}

	public void setTimesToEat(int timesToEat) {
		this.timesToEat = timesToEat;
	}

}
