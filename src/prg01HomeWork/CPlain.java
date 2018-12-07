package prg01HomeWork;

public class CPlain extends CVehicle {
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

	public CPlain(int x, int y, int price, int speed, int dateYear, int height ,int numPassPlain) {
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
