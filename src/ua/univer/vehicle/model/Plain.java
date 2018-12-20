package ua.univer.vehicle.model;

import prg01HomeWork.Vehicle;

public class Plain extends Vehicle {
	public int height ;
	public int numPassPlain ;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumPassPlain() {
		return numPassPlain;
	}
	public void setNumPassPlain(int numPassPlain) {
		this.numPassPlain = numPassPlain;
	}

	public Plain(int x, int y, int price, int speed, int dateYear, int height ,int numPassPlain) {
		super(x, y, price, speed, dateYear);
		this.height = height ;
		this.numPassPlain = numPassPlain ;
	}
	@Override
	public String toString() {
		return "CPlain [height=" + height + ", numPassPlain=" + numPassPlain + ", x=" + x + ", y=" + y + ", price="
				+ price + ", speed=" + speed + ", dateYear=" + dateYear + "]";
	}
	
	
}
