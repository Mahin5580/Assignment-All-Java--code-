package les3_3;

import java.util.Scanner; 
public class Scan {
	


	  public static void main(String[] args) {
	   try (Scanner my = new Scanner(System.in)) {
		String userName;
		
   
		System.out.println("Enter username"); 
		userName = my.nextLine();   
		   
		System.out.println("Username is: " + userName);
	}
		       
	  }
	}



