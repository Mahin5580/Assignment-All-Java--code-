package lec8;

public class Car4 extends Vehicle{
	public void display() {
		System.out.println("super speed");
		super.display();
	}
	//
public static void main(String[]args) {
	Car4 c1 =new Car4();
	
	c1.display();
	
}
}
