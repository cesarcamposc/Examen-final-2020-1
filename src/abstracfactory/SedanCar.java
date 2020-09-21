package abstracfactory;

public class SedanCar implements Car {
	private String name;

	public SedanCar(String cName) {
        name = cName;
    }

	public String getCarName() {
        return name;
    }

	public String getCarFeatures() {
        return "Sedan Car Features ";
    }


}
