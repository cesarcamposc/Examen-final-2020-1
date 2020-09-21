package abstracfactory;

public class Scooter implements Motorcycle{
	
	private String name;

	public Scooter(String cName) {
        name = cName;
    }

	public String getMotorcycleName() {
        return name;
    }

	public String getMotorcycleFeatures() {
        return "scooter Motorcycle Features ";
    }


}
