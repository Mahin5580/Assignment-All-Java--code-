package lab07;

public class Person1 {
	private String name;
	private int age;
	
	public Person1(String n,int a ) {
		this.name=n;
		this.age=a;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setId(int a) {
		this.age=a;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return age;
	}

}
