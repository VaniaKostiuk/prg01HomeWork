package ua.univer.vehicle.util;

import prg01HomeWork.Vehicle;

import ua.univer.vehicle.model.AmphibiousVehicles;
import ua.univer.vehicle.model.Betmobile;
import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Plain;
import ua.univer.vehicle.model.Ship;

public class VehicleFactory {
	public static Vehicle getVehicle (int i) {
		switch (i) {
		case 0: new Car (1,1,1000,100,2012);
		case 1: new Plain (2,2,100000,900,1955,10000,450);
		case 2: new Ship (3,3,250000,35,1931,1500,9);
		case 3: new AmphibiousVehicles (4,4,251000,80,2018,60);
		case 4: new Betmobile (5,5,351000,150,2019,90,250);
		default : return null;
		}
	}
	public static Vehicle randVehicle() {
		return getVehicle((int)(Math.random()*5));
	}
	public static Vehicle[] getListVehicle(int n) {
		Vehicle[] masVehicle = new Vehicle [n];
		for (int i = 0; i < masVehicle.length; i++) {
			masVehicle[i]=randVehicle();
		}
		return masVehicle;
	}
}
