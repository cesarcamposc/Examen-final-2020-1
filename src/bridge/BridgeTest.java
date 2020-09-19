package bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Shape circle = new Circle(new Red());
		circle.applyColor();
		
		Shape square = new Square(new Green());
		square.applyColor();
		
		
	}

}
