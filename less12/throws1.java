package less12;

public class throws1 {
    int a = 12;
    int b = 5;

    public void div() throws ArithmeticException {
        if (b == 5) {
            throw new ArithmeticException("Cannot divide");
        } else {
            int res = a / b;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        throws1 a = new throws1();
        try {
            a.div();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    
    }
}
