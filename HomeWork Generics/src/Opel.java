
public class Opel extends Car{

	public Opel(Brand carBrand, String model, int year, String color, int price, String regNumber, String id) {
		super(carBrand, model, year, color, price, regNumber);
	}

	@Override
	public String toString() {
		return "Opel [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
