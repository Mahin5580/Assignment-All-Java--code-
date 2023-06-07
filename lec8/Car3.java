package lec8;

public class Car3 extends Vechile3{
    int speed = 100;
    
    public Car3()
    {
        super("Red");
        System.out.println("Car is Created\n");
    }
    
    public void display()
    {
        super.display();
        System.out.println("Vehicle Speed is: "+super.speed);
        System.out.println("Car Speed is: "+speed);
    }    
    
    public static void main(String[] args) {        
        
        Car3 c1 = new Car3();       
        c1.display();      
      }


}
