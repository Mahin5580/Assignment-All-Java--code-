package less4;

public class Department {

	private String deptName;
	private int deptCode;
	private String faculty;
	
	public static void main(String[]args) {
		Department d1= new Department();
		Department d2=new Department();
		d1.deptName="CSE";
		d1.deptCode=15;
		d1.faculty="FSIT";
		d2.deptName="SWE";
		d2.deptCode=27;
		d2.faculty="FSIT";
		System.out.println("Name of dept:"+d1.deptName);
		System.out.println("Code of dept:"+d1.deptCode);
		System.out.println("Faculty of dept:"+d1.faculty);
		System.out.println("\n");
		System.out.println("Name of dept:"+d2.deptName);
		System.out.println("Code of dept:"+d2.deptCode);
		System.out.println("Faculty of dept:"+d2.faculty);
		
		
		
	}
	
}
