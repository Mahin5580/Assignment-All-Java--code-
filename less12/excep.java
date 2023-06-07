package less12;

public class excep {
 
	public static void main(String[] args) {
		int x=10;
		int y=0;
		int a[]=new int[2];
		try {
			int num=x/y;
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		try {
			System.out.println(a[3]);
		}
		catch(Exception e) {
			System.out.println("error2");
		}
	}

}

