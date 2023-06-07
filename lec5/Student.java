package lec5;

public class Student {
	String id;
	String name;
	double Cgpa;
	
	public void instert_Record(String id,String n,double cgpa) {
		this.id=id;
		this.name =n ;
		this.Cgpa=cgpa;
	}

	public void display_Record() {
		System.out.println("Name;"+name);
		System.out.println("ID"+id);
		System.out.println("Cgpa"+Cgpa);
		
	}
	public static void main(String[]args) {
		Student s1=new Student();
		s1.instert_Record("221-15-5580","Mahin",4.00);
				s1.display_Record();
	}
}
