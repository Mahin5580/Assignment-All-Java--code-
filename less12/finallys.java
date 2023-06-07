package less12;

public class finallys {

	public static void main(String[] args) {
		try {
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("finally");
		}
	}
}
