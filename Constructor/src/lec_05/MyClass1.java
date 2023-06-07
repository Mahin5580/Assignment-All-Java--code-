package lec_05;

public class MyClass1 {

	int x;
	public MyClass1(int y) {
		
		x=y;
	}
	public static void main(String[] args) {
		MyClass1 c1=new MyClass1(50);
		System.out.println(c1.x);
	}
}