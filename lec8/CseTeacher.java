package lec8;

public class CseTeacher extends Teacher{
	String mainsub="CSE";
	public static void main(String[]args) {
		CseTeacher rabbi=new CseTeacher();
		System.out.println(rabbi.mainsub);
		System.out.println(rabbi.designatoion);
		System.out.println(rabbi.uniName);
		rabbi.job();
		
	}

}
