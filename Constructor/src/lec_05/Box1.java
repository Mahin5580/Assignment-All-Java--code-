package lec_05;

public class Box1 {
	int height;
	int width;
	public Box1() {
		System.out.println("Box created");
		this.height=10;
		this.width=20;
	}
	public static void main(String[] args) {
		Box1 b1=new Box1();
		System.out.println("Height"+b1.height);
		System.out.println("width"+b1.width);
		
	}

}
