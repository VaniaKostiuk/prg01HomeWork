package ua.univer.vehicle.model;

import prg01HomeWork.Vehicle;

public class Ship extends Vehicle {
	public int numPassShip ;
	public int homePort ;
	
	public int getNumPassShip() {
		return numPassShip;
	}
	public void setNumPassShip(int numPassShip) {
		this.numPassShip = numPassShip;
	}

	public int getHomePort() {
		return homePort;
	}
	public void setHomePort(int homePort) {
		this.homePort = homePort;
	}

	public Ship(int x, int y, int price, int speed, int dateYear,int numPassShip,int homePort) {
		super(x, y, price, speed, dateYear);
		this.numPassShip = numPassShip ; 
		this.homePort = homePort ;
	}
	@Override
	public String toString() {
		return "CShip [numPassShip=" + numPassShip + ", homePort=" + homePort + ", x=" + x + ", y=" + y + ", price="
				+ price + ", speed=" + speed + ", dateYear=" + dateYear + "]";
	}
	
	

}
