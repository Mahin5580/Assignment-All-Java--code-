package lec05;

public class Ex02 {
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;
	        int maxNum = max(a, b);
	        System.out.println("The maximum between " + a + " and " + b + " is " + maxNum);
	    }

	    public static int max(int num1, int num2) {
	        if (num1 > num2) {
	            return num1;
	        } else {
	            return num2;
	        }
	    }
	}

	
