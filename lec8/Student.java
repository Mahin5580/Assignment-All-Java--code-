package lec8;

public class Student extends Person {
	private int id;
	private double cgpa;
	
	public void setId(int i){
		id=i;
		
	}
	public void setcgpa(double c) {
		cgpa =c;
		
	}
	int getId() {
		return id;
	}
	double getcgpa() {
		return cgpa;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(getId());
		System.out.println(getcgpa());
		
	}

	public static void main(String []args) {
		Student p1=new Student();
		p1.age=22;
		p1.name="mahin";
		p1.setId(5580);
		p1.setcgpa(3.556);
		p1.display();
		
	}
}
