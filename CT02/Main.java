package CT02;

public class Main {

	public static void main(String[] args) {
		adderessInfo address=new adderessInfo("sec4","uttara","Dhaka","546");
		InsurenceInfo in=new InsurenceInfo("LI",22);
		Employee e1=new Employee("mahin",address,in);
		e1.display();
		

	}

}
