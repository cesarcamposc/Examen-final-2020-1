package Decorator;


public abstract class SandwichEgg implements Sandwich {
protected Sandwich SandwichEgg;
	
	
	public SandwichEgg(Sandwich SandwichEgg ) {
	 this.SandwichEgg = SandwichEgg;
			
	}
	@Override
	public String make() {
        return SandwichEgg.make();
        
	}
}
