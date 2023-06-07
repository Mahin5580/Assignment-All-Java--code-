package lec_05;

public class Employee {

	int empId;
	String empName;
	public Employee(int i,String n) {
		this.empId=i;
		this.empName=n;
		
	}
	void info() {
		System.out.println("Id"+empId + "\n"+"Name"+empName);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(221,"MMK");
		e1.info();
	}
}
