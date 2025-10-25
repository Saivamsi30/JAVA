package Questions;

public class Q3 {
    public static void main(String[] args) {
//        try{
//            int arr[] = {10,23,33};
//            System.out.println(arr[1]);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("ArithmeticException");
//        }
//        finally {
//            System.out.println("Done");

        try{
            int arr[] = {10,23,33};
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally{
            System.out.println("Done....");
        }
    }
}
