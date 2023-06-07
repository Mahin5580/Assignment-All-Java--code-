package lec8;

public class Mycal extends Calculation {

	   public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product :"+z);
	   }
	   public void division(int x, int y) {
	      z = x / y;
	      System.out.println("The Division :"+z);
	   }
		
	   public static void main(String[] args) {
	      int a = 20, b = 10;
	      Mycal demo = new Mycal();
	      demo.addition(a, b);
	      demo.subtraction(a, b);
	      demo.multiplication(a, b);
	      demo.division (a, b);
	   }


}
