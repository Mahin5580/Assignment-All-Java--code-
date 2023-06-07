package lec5;

public class Max1 {

	
	    public static void main(String[] args) {
	        int num1 = 5, num2 = 10, num3 = 15;
	        double double1 = 10.5, double2 = 20.7;

	     
	        int maxInt = Math.max(num1, num2);
	        System.out.println("Max value between " + num1 + " and " + num2 + " is: " + maxInt);

	        int maxInt3 = Math.max(num1, Math.max(num2, num3));
	        System.out.println("Max value between " + num1 + ", " + num2 + " and " + num3 + " is: " + maxInt3);

	      
	        double maxDouble = Math.max(double1, double2);
	        System.out.println("Max value between " + double1 + " and " + double2 + " is: " + maxDouble);
	    }
	}


