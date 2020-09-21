package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		
		KickInterface lightningKick = new Lightning();
        KickInterface butterflyKick = new Butterfly();
        KickInterface tornadoKick = new Tornado();
		JumpInterface shortJump = new Short();
        JumpInterface longJump = new Long();
        
        Fighter paul = new Paul(lightningKick, shortJump);
        paul.display();

        //paul.kick();
        //paul.jump();
        
        paul.setKickStrategy(butterflyKick);
        paul.kick();
        
        paul.setJumpStrategy(longJump);
        paul.jump();
        
        paul.setKickStrategy(tornadoKick);
        paul.kick();
        
        paul.setJumpStrategy(shortJump);
        paul.jump();
        
        paul.setKickStrategy(lightningKick);
        paul.kick();
        
        paul.setJumpStrategy(longJump);
        paul.jump();

        paul.setKickStrategy(tornadoKick);
        paul.kick();
        
        
        
       }

}
