import java.util.ArrayList;


public class OpelFactory extends CarFactory<Opel> {

	

	public ArrayList<Opel> opels = new ArrayList<>();

	@Override
	public Opel getCar(Brand carBrand, String model, int year, String color, int price, String regNumber) {        
		String id = regNumber + model;
		Opel Opel = new Opel(carBrand, model, year, color, price, regNumber, id);
        opels.add(Opel);
                
        return Opel;
    }
}
