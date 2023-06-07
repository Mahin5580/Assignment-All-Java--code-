package lec5;

public class Box1 {
	int hight;
	int width;

	public Box1(int a,int b) {
		hight=a;
		width=b;
		
	}
	public void display_info(){
		
		System.out.println("HIght"+hight);
		System.out.println("Width"+width);
	}
	public static void main(String[]args) {
		Box1 b1=new Box1(45,40);
		b1.display_info();
		Box1 b2=new Box1(12,10);
		
		b2.display_info();
	}
}
