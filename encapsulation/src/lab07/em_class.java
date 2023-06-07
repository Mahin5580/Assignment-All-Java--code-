package lab07;

public class em_class {
	public static void main(String[] args) {
		EMployee e1=new EMployee("mmk",221,55000);
		e1.display();
		//System.out.println(e1.getId()+"\n"+e1.getName()+"\n"+e1.getSalary());
		e1.setName("Mahin");
		
		e1.setId(54);
		
		
		e1.setSalary(55400);
		e1.display();
		
		//System.out.println(e1.getId()+"\n"+e1.getName()+"\n"+e1.getSalary());
		//System.out.println(e1.getName());
	}

}
