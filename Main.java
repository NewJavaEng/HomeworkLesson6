package by.http.lesson6main;

import java.util.Arrays;
import java.util.Scanner;

import by.http.food.Food;
import by.http.transport.Bus;
import by.http.transport.Plane;
import by.http.transport.Ship;
import by.http.transport.Train;
import by.http.transport.Transport;
import by.http.trips.Cruise;
import by.http.trips.Excursion;
import by.http.trips.Shopping;
import by.http.trips.Treatment;
import by.http.trips.Trip;

public class Main {

	public static void main(String[] args) {

		// constructor is used from Bus class, String name, int transferCost, int
		// placeCount, int stopCount
		Bus ecolines = new Bus("Ecolines bus", 30, 48, 5);
		Bus eurolines = new Bus("Eurolines bus", 25, 50, 7);
		Bus ikarus = new Bus("Ikarus bus", 15, 60, 3);

		// constructor is used from Ship class
		// String name, int transferCost, int cabinCount
		Ship santaMaria = new Ship("Santa-Maria ship", 110, 200);
		Ship victory = new Ship("Victory ship", 130, 138);
		Ship titanik = new Ship("Titanik ship", 90, 93);

		// constructor is used from Plane class
		// String name, int transferCost, int changeCount
		Plane boeing = new Plane("Boeing plane", 135, 0);
		Plane airbus = new Plane("Airbus plane", 150, 1);
		Plane tu = new Plane("Tu plane", 130, 2);

		// constructor is used from Train class
		// String name, int transferCost, int compartmentCount
		Train intescity = new Train("Intescity train", 93, 20);
		Train bjd = new Train("BJD train", 15, 351);
		Train eurostar = new Train("Eurostar train", 45, 48);

		// constructor is used from Food class
		// boolean drinks, int timesToEat, boolean vegan, int foodCost
		Food food1 = new Food(true, 1, true, 100);
		Food food2 = new Food(false, 3, false, 362);
		Food food3 = new Food(true, 2, false, 211);

		Trip[] allTrips = new Trip[8];

		// constructor is used from Excursion class
		// int tripDuration, Food[] food, Transport[] transport, int serviceCost, int
		// citiesCount, String emotion
		Transport[] exc1Tr = new Transport[] { ecolines, boeing };
		Food[] exc1Fo = new Food[] { food1, food2 };
		Excursion excursion1 = new Excursion(5, exc1Fo, exc1Tr, 70, 7, "wonderful");
		allTrips[0] = excursion1;
		Transport[] exc2Tr = new Transport[] { tu, ikarus };
		Food[] exc2Fo = new Food[] { food1, food3 };
		Excursion excursion2 = new Excursion(7, exc2Fo, exc2Tr, 100, 10, "exciting");
		allTrips[1] = excursion2;

		// constructor is used from Cruise class
		// int tripDuration, Food[] food, Transport[] transport, int serviceCost, int
		// citiesCount, int portsCount
		Transport[] cru1Tr = new Transport[] { santaMaria, victory };
		Food[] cru1Fo = new Food[] { food1, food3 };
		Cruise cruise1 = new Cruise(10, cru1Fo, cru1Tr, 40, 4, 4);
		allTrips[2] = cruise1;
		Transport[] cru2Tr = new Transport[] { titanik, victory };
		Food[] cru2Fo = new Food[] { food2, food3 };
		Cruise cruise2 = new Cruise(13, cru2Fo, cru2Tr, 60, 6, 6);
		allTrips[3] = cruise2;

		// constructor is used from Treatment class
		// int tripDuration, Food[] food, Transport[] transport, int serviceCost, String
		// resortName
		Transport[] tre1Tr = new Transport[] { airbus, intescity };
		Food[] tre1Fo = new Food[] { food1, food2 };
		Treatment treatment1 = new Treatment(7, tre1Fo, tre1Tr, 48, "Yunost");
		allTrips[4] = treatment1;
		Transport[] tre2Tr = new Transport[] { bjd, tu };
		Food[] tre2Fo = new Food[] { food2, food3 };
		Treatment treatment2 = new Treatment(14, tre2Fo, tre2Tr, 63, "Podolsk");
		allTrips[5] = treatment2;

		// constructor is used from Shopping class
		// int tripDuration, Food[] food, Transport[] transport, int serviceCost, String
		// cityName
		Transport[] sho1Tr = new Transport[] { eurostar, ikarus };
		Food[] sho1Fo = new Food[] { food1, food2 };
		Shopping shopping1 = new Shopping(3, sho1Fo, sho1Tr, 59, "Vilnius");
		allTrips[6] = shopping1;
		Transport[] sho2Tr = new Transport[] { eurolines, ikarus };
		Food[] sho2Fo = new Food[] { food2, food3 };
		Shopping shopping2 = new Shopping(4, sho2Fo, sho2Tr, 81, "Belastok");
		allTrips[7] = shopping2;

		System.out.println("This is the whole list of our offers:");
		for (int i = 0; i < allTrips.length; i++) {
			System.out.println(allTrips[i].printTrip() + " and cost - " + allTrips[i].costCalc() + " BYN");
		}

		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of your choise (from 1 to 8) or enter 0 to sort according to the price: ");
		int choiseNumber = sc.nextInt();

		System.out.println();

		if (choiseNumber >= 1 && choiseNumber <= 8) {
			System.out.println("Thank you for being with us!");

		}
		if (choiseNumber == 0) {
			sortTrips(allTrips);

		}
		if (choiseNumber < 0 || choiseNumber > 8) {
			System.out.println("Entered number is out of range! Please, enter correct number!");

		}

	}

	private static void sortTrips(Trip[] allTrips) {
		for (int i = allTrips.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				if (allTrips[j].costCalc() > allTrips[j + 1].costCalc()) {
					Trip buff = allTrips[j];
					allTrips[j] = allTrips[j + 1];
					allTrips[j + 1] = buff;
				}

		}

		for (int i = 0; i < allTrips.length; i++) {
			System.out.println(allTrips[i].printTrip() + " and cost - " + allTrips[i].costCalc() + " BYN");
		}

	}
}
