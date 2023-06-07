package lec8;

public class Student extends Person{
	private int id=5510;
	private double cgpa= 4;
	public void display() {
		System.out.println("Study");
	}
	public static void main(String[]args) {
		Student obj =new Student();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.id);
		System.out.println(obj.cgpa);
		obj.display();
	} 

}
