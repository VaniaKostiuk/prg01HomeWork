package prg01HomeWork;

public abstract class CVehicle {
	
	public int x , y ;
	public int price ;
	public int speed ;
	public int dateYear;
	
	public int getX() {
		return x;
	}
    public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDateYear() {
		return dateYear;
	}
	public void setDateYear(int dateYear) {
		this.dateYear = dateYear;
	}

	public CVehicle(int x, int y, int price, int speed, int dateYear) {
		super();
		this.x = x;
		this.y = y;
		this.price = price;
		this.speed = speed;
		this.dateYear = dateYear;
	}
	@Override
	public String toString() {
		return "CVehicle [x=" + x + ", y=" + y + ", price=" + price + ", speed=" + speed + ", dateYear=" + dateYear
				+ "]";
	}
	
	
}
