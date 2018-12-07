package prg01HomeWork;

public class CShip extends CVehicle {
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

	public CShip(int x, int y, int price, int speed, int dateYear,int numPassShip,int homePort) {
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
