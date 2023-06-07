package less12;

public class parseint {
    public static void main(String[]args){
    String first="12t";
    try{
    int tem=Integer.parseInt(first);
    System.out.println(tem);
}
    catch(Exception e)
    {
    System.out.println("num not found");
}
    
    
    }

}
