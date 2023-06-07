package lec5;

public class Max {
	

public static void main(String[]args) {
	int a=14;
	int b= 45;
	Max m1=new Max();
	int z=m1.max(a,b);
	System.out.println("Value:"+z);
}
public int max(int x,int y) {
	
	if(x>y)
		return x;
	else
		return y;
}
}
