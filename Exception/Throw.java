package Exception;

public class Throw {
	static void date(int age) {
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome");
		
	}
	public static void main(String args[]) {
		date(12);
		System.out.println("rest of the code");
	}

}
