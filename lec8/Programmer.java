package lec8;

public class Programmer extends Employee{
	float bonus=10000;
	public static void main(String[]args) {
		Programmer p1=new Programmer();
		System.out.print(p1.bonus);
		System.out.print("\n" +p1.salary);
		
	}

}
