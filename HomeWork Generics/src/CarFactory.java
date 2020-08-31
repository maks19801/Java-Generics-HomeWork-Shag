import java.util.ArrayList;

public abstract class CarFactory<T extends Car> {

	ArrayList<T> allCars = new ArrayList<>();

	abstract T getCar(Brand carBrand, String model, int year, String color, int price, String regNumber);

}
