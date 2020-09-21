package abstracfactory;

public class CompactCar implements Car {
	
	private String name;

	public CompactCar(String cName) {
        name = cName;
    }

	public String getCarName() {
        return name;
    }

	public String getCarFeatures() {
        return "Compact Car Features ";
    }

}
