package Decorator;


public abstract class SandwichChicken implements Sandwich {
protected Sandwich SandwichChicken;
	
	
	public SandwichChicken(Sandwich SandwichChicken ) {
	 this.SandwichChicken = SandwichChicken;
			
	}
	@Override
	public String make() {
        return SandwichChicken.make();
	}
}
