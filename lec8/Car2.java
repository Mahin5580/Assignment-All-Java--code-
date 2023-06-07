package lec8;

public class Car2 extends Vehi {
	int speed=45;
	public Car2(int s) {
		super(s);
		System.out.println("CAr create");
		
	}
	public void display() {
		System.out.println(" speed"+speed);
		System.out.println("Speed"+super.speed);
	}
	public static void main(String[]args) {
		Car2 c=new Car2(100);
		c.display();
	}

}
