package less12;

public class throw1 {

	  public static void main(String[] args) {
	        try {
	            int age = 13;
	            if (age < 18)
	                throw new ArithmeticException("Not valid");
	            else
	                System.out.println("Welcome");
	        } catch (ArithmeticException e) {
	            System.out.println(e);
	        }
	    }

	
}
