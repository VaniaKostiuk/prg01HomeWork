package ua.univer.vehicle.model;

import prg01HomeWork.Vehicle;

public class Car extends Vehicle {

	public Car(int x, int y, int price, int speed, int dateYear) {
		super(x, y, price, speed, dateYear);
	}

	@Override
	public String toString() {
		return "CCar [x=" + x + ", y=" + y + ", price=" + price + ", speed=" + speed + ", dateYear=" + dateYear + "]";
	}
	//gitsink
}
