package Exception;

import java.util.Scanner;

public class Problem_practice {
	public static void main(String[]args) {
		while(true) {
		try {
			
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter num1:");
		int num1 =sc.nextInt();
		System.out.println("Please enter num2:");
		int num2 =sc.nextInt();
		int result =num1/num2;
		System.out.println("Result"+num1+"/"+num2+"="+result);
		}
		catch(Exception e){
			System.out.println("Exception"+e);
			System.out.println("Only Integer Number");
			
		}
		}
		}
	}


