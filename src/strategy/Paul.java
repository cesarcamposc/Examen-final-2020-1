package strategy;

public class Paul extends Fighter{
	
	 
	public Paul(KickInterface kickBehavior, JumpInterface jumpBehavior) { 
		 
		 super(kickBehavior,jumpBehavior);
	} 
	 
	 @Override
	 public void display() { 
		 
		 System.out.println("Hola, soy Paul");
	 } 

}
