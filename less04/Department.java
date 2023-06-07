package less04;

public class Department {

	private String deptName;
	private int deptcode;
	private String faculty;
	
	public static void main (String[]args)
	{
		Department d1=new Department();
		d1.deptName="CSE";
		d1.deptcode=15;
		d1.faculty="FSIT";
		
		Department d2=new Department();
		d2.deptName="SWE";
		d2.deptcode=22;
		d2.faculty="FSIT";
		
		System.out.println("Dept:"+d1.deptName);
		System.out.println("Code:"+d1.deptcode);
		System.out.println("Faculty:"+d1.faculty);
		
			
		System.out.println("\nDept:"+d2.deptName);
		System.out.println("Code:"+d2.deptcode);
		System.out.println("Faculty:"+d2.faculty);
		
	}
	
}
