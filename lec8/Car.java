package lec8;

public class Car extends Vehicle{

        int speed = 100;

        public void display() {
            System.out.println ("bike speed :" +super.speed);
        }
        void tech() {
        	super.display();
        	display();
        }

        public static void main(String[] args) {
            Car bike = new Car();
           
            bike.tech ();

            
        }
    }


