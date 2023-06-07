package Exception;

public class Exception_handeling {
	public static void main(String[]args) {
		try {
		int x=10;
		int y=0;
		
		int result=x/y;
		System.out.println("Res:"+result);
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("Exception:"+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception:"+e);
		}
		finally {		
		System.out.println("last line");
		}
		
		
		try {
			int[] a= new int [4];
			a[4]=20;
			
			}
			catch(ArithmeticException c) {
				System.out.println("Exception:"+c);
			}
			catch(Exception e) {
				System.out.println("Exception:"+e);
	}	
			System.out.println("last line");
			
		
	}

}
