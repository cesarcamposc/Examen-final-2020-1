package abstracfactory;



public class CarVehicleFactory extends VehicleFactory {

	public Car getCar() {
        return new SedanCar("Sedan Car");
    }

	public Motorcycle getMotorcycle() {
        return new Scooter("Scooter Motorcycle");
    }

}
