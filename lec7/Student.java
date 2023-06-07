package lec7;

public class Student {
	private String name;
	private int id;
	private double cgpa;
	
	public Student(String n,int i,double cg) {
		name=n;
		id=i;
		cgpa=cg;
	}
	//public void display() {
	//	System.out.println(getName());
		//System.out.println(getid());
		//System.out.println(getCgpa());
	//}
	
	public void setName(String n) {
		name=n;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setCgpa(double cg) {
		cgpa=cg;
	}
	public String getName() {
		return name;
	}
	public int getid() {
		return id;
	}
	public double getCgpa() {
		return cgpa;
	}

}
