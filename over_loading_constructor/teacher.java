package over_loading_constructor;

public class teacher {

		    
		    int height;
		    int width;
		    
		    public teacher()
		    {
		        System.out.println("Box Created.");
		        this.height = 10;
		        this.width = 20;
		    }
		    void displayinfo(){
		    	 System.out.println("The height of box = "+height);
			      System.out.println("The width of box = "+width);
			      
		    }
		    

		    public static void main(String[] args) {
		        
		    	teacher box1 = new teacher();
		    	box1.displayinfo();
		     
		      teacher box2 = new teacher();      
		      box2.displayinfo();           
		              
		    }
		

		
		
		
	}
	
