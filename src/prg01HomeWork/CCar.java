package prg01HomeWork;

public class CCar extends CVehicle {

	public CCar(int x, int y, int price, int speed, int dateYear) {
		super(x, y, price, speed, dateYear);
	}

	@Override
	public String toString() {
		return "CCar [x=" + x + ", y=" + y + ", price=" + price + ", speed=" + speed + ", dateYear=" + dateYear + "]";
	}
	//gitsink
}
