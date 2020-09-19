package Decorator;

public abstract class sandwichBacon implements Sandwich {
protected Sandwich SandwichBacon;
	
	
	public void SandwichBacon(Sandwich SandwichBacon ) {
	 this.SandwichBacon = SandwichBacon;
			
	}
	@Override
	public String make() {
        return SandwichBacon.make();
	}
}
