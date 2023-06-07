package lec8;

public class Student1 extends Person1{
	private int id;
	private double cgpa;
	
	public Student1(String n,int a,int i,double c) {
		super(n,a);
		id=i;
		cgpa=c;
		
	}
	public void display() {
		super.display();
		 System.out.println(id);
		 System.out.println(cgpa);
	}
	public static void main(String[]args) {
		Student1 s=new Student1("mmk",20,558,3.5);
		s.display();
	}

}
