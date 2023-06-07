package lab07;

public class EMployee {
	private String name;
	private int id;
	private double salary;
	public EMployee(String n,int i,double s) {
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setId(int i) {
		this.id=i;
	}
	public void setSalary(double s) {
		this.salary=s;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		System.out.println(getName());
		System.out.println(getId());
		System.out.println(getSalary());
	}
		

}
