package less12;

public class multiple {
public static void main(String[] args) {
	
	int a[]=new int[2];
	try {
		System.out.println(a[3]);
	}
	catch(ArithmeticException e) {
		System.out.println("arith");
	}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index");
	}
	catch(Exception e) {
		System.out.println("null");
	}
}
}
