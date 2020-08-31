
public class Main {

	public static void main(String[] args) {
		
		MercedesFactory factory = new MercedesFactory();
		Mercedes mercedes1 = factory.getCar(Brand.MERCEDES,"SLK",2015,"WHITE",2000000,"АА0101IT");
		Mercedes mercedes2 = factory.getCar(Brand.MERCEDES,"SLK",2005, "RED",900000,"АА7777IT");

		
        System.out.println(factory.mercedeses);
        
        OpelFactory factory1 = new OpelFactory();
		Opel opel1 = factory1.getCar(Brand.OPEL,"Vectra",2000, "GREEN",150000,"АА5555НН");
		Opel opel2 = factory1.getCar(Brand.OPEL,"Vect",2015, "BLUE",160000,"АА23455НН");

		for (Opel opel:factory1.opels)
        System.out.println(opel.toString());

	}

}
