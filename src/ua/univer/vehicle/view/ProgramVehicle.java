package ua.univer.vehicle.view;

import prg01HomeWork.Vehicle;
import ua.univer.vehicle.model.Car;
import ua.univer.vehicle.model.Plain;
import ua.univer.vehicle.model.Ship;

public class ProgramVehicle {
	public static void main(String[] args) {
		
		 Vehicle plaine1 = new Plain (1,1,200000,1500,2018,9000,450) ;
		 	plaine1.setPrice(1000000);
		 
		 Vehicle car1 = new Car (2,2,2000,180,2010) ;
		 	car1.setPrice(2500);
		 
		 Vehicle ship1 = new Ship (3,3,2000000,20,1956,13,25000) ;
		 	ship1.setSpeed(30);
		 
		 Vehicle[] masObj = new Vehicle[3];
		 	masObj[0] = plaine1 ;
		 	masObj[1] = car1 ;
		 	masObj[2] = ship1 ;

		for (Vehicle s : masObj) {
			System.out.println(s.toString());
		}
	}
}
