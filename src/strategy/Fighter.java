package strategy;

public abstract class Fighter {
	
	KickInterface kickBehavior; 
    JumpInterface jumpBehavior; 
  
    public Fighter(KickInterface kickBehavior, JumpInterface jumpBehavior) { 
        
    	this.jumpBehavior = jumpBehavior; 
        this.kickBehavior = kickBehavior; 
    } 
    
    public void kick() { 
	   
        // delegate to kick behavior 
        kickBehavior.kick();
        
    } 
    
    public void jump() { 
  
        // delegate to jump behavior 
        jumpBehavior.jump(); 
    } 
    
        
    public void setKickStrategy(KickInterface kickBehavior) { 
    	
        this.kickBehavior = kickBehavior; 
    } 
    
    public void setJumpStrategy(JumpInterface jumpBehavior) { 
    	
        this.jumpBehavior = jumpBehavior; 
    } 
    
    public abstract void display(); 
}
