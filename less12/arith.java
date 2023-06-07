package less12;

public class arith {
	int a=12;
			int b=5;
			public void div() {
				if(b==5) {
					throw new ArithmeticException("cant divide");
				}
				else {
					int res=a/b;
					System.out.println(res);
				}
			}
	   public static void main(String args[]){
		   arith a=new arith();
	        try{
	        	a.div();
	          
	        }
	        catch(ArithmeticException e){
	        System.out.println(e);
	        
	        
	    }
	    
	   }
}

