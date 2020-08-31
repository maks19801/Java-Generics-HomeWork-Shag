import java.util.ArrayList;


public class MercedesFactory extends CarFactory<Mercedes> {

	
	public ArrayList<Mercedes> mercedeses = new ArrayList<>();

	@Override
	public Mercedes getCar(Brand carBrand, String model, int year, String color, int price, String regNumber) {        
		String id = regNumber + year;
		Mercedes mercedes = new Mercedes(Brand.MERCEDES, model, year, color, price, regNumber, id);
        mercedeses.add(mercedes);
                
        return mercedes;
    }
}
