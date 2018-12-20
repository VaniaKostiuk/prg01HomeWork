package ua.univer.vehicle.model;

import prg01HomeWork.Vehicle;

public class AmphibiousVehicles extends Vehicle {

	public int speedSwim ;
	
	public AmphibiousVehicles(int x, int y, int price, int speed, int dateYear,int speedSwim) {
		super(x, y, price, speed, dateYear);
		this.speedSwim = speedSwim;
	}
	public int getSpeedSwim() {
		return speedSwim;
	}
	public void setSpeedSwim(int speedSwim) {
		this.speedSwim = speedSwim;
	}
	@Override
	public String toString() {
		return "AmphibiousVehicles [speedSwim=" + speedSwim + "]";
	}
	
	
	
}
