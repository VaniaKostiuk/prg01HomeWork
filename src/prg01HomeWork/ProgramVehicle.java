package prg01HomeWork;

public class ProgramVehicle {
	public static void main(String[] args) {
		
		 CVehicle plaine1 = new CPlain (1,1,200000,1500,2018,9000,450) ;
		 	plaine1.setPrice(1000000);
		 
		 CVehicle car1 = new CCar (2,2,2000,180,2010) ;
		 	car1.setPrice(2500);
		 
		 CVehicle ship1 = new CShip (3,3,2000000,20,1956,13,25000) ;
		 	ship1.setSpeed(30);
		 
		 CVehicle[] masObj = new CVehicle[3];
		 	masObj[0] = plaine1 ;
		 	masObj[1] = car1 ;
		 	masObj[2] = ship1 ;

		for (CVehicle s : masObj) {
			System.out.println(s.toString());
		}
	}
}
