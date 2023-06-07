package abs;

public abstract class Vehicle {

	public Vehicle() {
		System.out.println("Bus");
	}
	public abstract void move();
	public void carry() {
		System.out.println("carry load");
	}
	
}
