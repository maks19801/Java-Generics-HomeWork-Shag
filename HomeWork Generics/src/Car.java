
public abstract class Car {
	public static int newId = 1;
	private Brand carBrand;
	private String model;
	private int year;
	private String color;
	private int carPrice;
	private String regNumber;

	public Car(Brand carBrand, String model, int year, String color, int price, String regNumber) {
		this.carBrand = carBrand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.carPrice = price;
		this.regNumber = regNumber;
		newId = newId++;
	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", model=" + model + ", year=" + year + ", color=" + color + ", price="
				+ carPrice + ", regNumber=" + regNumber + "]";
	}

}