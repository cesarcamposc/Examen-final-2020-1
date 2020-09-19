package abstracfactory;

/*import abstractfactory.Car;
import abstractfactory.CarVehicleFactory;
import abstractfactory.MotorcycleVehicleFactory;
import abstractfactory.SUV;
import abstractfactory.VehicleFactory;
*/

public abstract class VehicleFactory {
	
	public static final String CAR_VEHICLE = "Car";
	public static final String MOTORCYCLE_VEHICLE = "Motorcycle";
	
	public abstract Car getCar();
	public abstract Motorcycle getMotorcycle();
	
	public static VehicleFactory getVehicleFactory(String type) {
		
		if (type.equals(VehicleFactory.CAR_VEHICLE)) {
		    return new CarVehicleFactory();
		}
		
		if (type.equals(VehicleFactory.MOTORCYCLE_VEHICLE)) {
		    return new MotorcycleVehicleFactory();
		}
		
		return new CarVehicleFactory();
	}
}