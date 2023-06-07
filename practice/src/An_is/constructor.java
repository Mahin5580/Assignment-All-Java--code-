package An_is;

public class constructor {
	
	String name,gender;
	int phone;
	
	
		
	
	
	public static void main(String[]args) {
		
	
		constructor con1=new constructor("mmk","male",225896);
		con1.displayinfo();
		constructor con2=new constructor("mmkmahin","male",6742);
		con2.displayinfo();
		constructor con3=new constructor();
		con3.displayinfo();
	
	}
	constructor(){
		System.out.println("no value");
		
		
	}
	constructor(String n,String g,int ph){
	name=n;
	gender=g;
	phone=ph;
	}
	
		
	void displayinfo() {
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("phone:"+phone);
		System.out.println("\n\n");
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

	
}
