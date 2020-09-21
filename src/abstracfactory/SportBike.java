package abstracfactory;

public class SportBike implements Motorcycle {
	
	private String name;

	public SportBike(String cName) {
        name = cName;
    }

	public String getMotorcycleName() {
        return name;
    }

	public String getMotorcycleFeatures() {
        return "Spoortbike Motorcycle Features ";
    }


}
