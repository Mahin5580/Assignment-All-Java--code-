package lec_05;

public class Box {
	
	    public int height;
	    public int width;

	    public Box(int h, int w) {
	        this.height = h;
	        this.width = w;
	    }

	    public Box() {
	        height = 10;
	        width = 20;
	    }

	    public void display() {
	        System.out.println("Box height: " + height + ", width: " + width);
	    }

	    public static void main(String[] args) {
	        Box b1 = new Box();
	        b1.display();
	        
	        Box b2 = new Box(100, 200);
	        b2.display();
	        
	        Box b3 = new Box();
	        b3.display();
	        
	        System.out.println("Box height: " + b1.height + ", width: " + b1.width);
	        System.out.println("Box height: " + b2.height + ", width: " + b2.width);
	        System.out.println("Box height: " + b3.height + ", width: " + b3.width);
	    }
	

	

}
