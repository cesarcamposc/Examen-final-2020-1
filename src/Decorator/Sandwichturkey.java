package Decorator;


public abstract class Sandwichturkey implements Sandwich {
protected Sandwich Sandwichturkey;
	
	
	public Sandwichturkey(Sandwich Sandwichturkey ) {
	 this.Sandwichturkey = Sandwichturkey;
			
	}
	@Override
	public String make() {
        return Sandwichturkey.make();
}

}
