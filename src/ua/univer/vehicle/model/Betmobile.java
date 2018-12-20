package ua.univer.vehicle.model;

import prg01HomeWork.Vehicle;

public class Betmobile extends Vehicle{

	public int speedSwim ;
	public int speedFly ;
	
	public Betmobile(int x, int y, int price, int speed, int dateYear, int speedSwim, int speedFly) {
		super(x, y, price, speed, dateYear);
		this.speedSwim = speedSwim;
		this.speedFly = speedFly;
	}

	public int getSpeedSwim() {
		return speedSwim;
	}

	public void setSpeedSwim(int speedSwim) {
		this.speedSwim = speedSwim;
	}

	public int getSpeedFly() {
		return speedFly;
	}

	public void setSpeedFly(int speedFly) {
		this.speedFly = speedFly;
	}

	@Override
	public String toString() {
		return "Betmobile [speedSwim=" + speedSwim + ", speedFly=" + speedFly + "]";
	}

	
	
	
	
}
