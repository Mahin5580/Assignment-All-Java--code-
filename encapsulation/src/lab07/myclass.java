package lab07;

public class myclass {
	public static void main(String[] args) {
		Person1 p1=new Person1("mmk",5466);
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		p1.setName("mahin");
		p1.setId(221);
		System.out.println(p1.getName());
		System.out.println(p1.getId());
	}

}
