
public class Mercedes extends Car {

	public Mercedes(Brand carBrand, String model, int year, String color, int price, String regNumber, String id) {
		super(carBrand, model, year, color, price, regNumber);
	}

	@Override
	public String toString() {
		return "Mercedes [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	

}
