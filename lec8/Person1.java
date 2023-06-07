package lec8;

public class Person1 {
 protected String name;
 protected int age;
 public Person1(String n,int a) {
	 this.name=n;
	 this.age=a;
	 
	 System.out.println("class person creted");
 }
 public void display() {
	 System.out.println(name);
	 System.out.println(age);
 }
}
