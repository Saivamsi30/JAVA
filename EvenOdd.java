//public class EvenOdd {
//    public static void main(String[] args) {
//        int [] arr = {2,3,5,6,8};
//
//        for(int i = 0;i < arr.length;i++)
//        {
//            if(arr[i]%2==0)
//            {
//                System.out.println(arr[i] + "is Even");
//            }
//            else{
//            System.out.println(arr[i] + "is Odd");
//        }
//        }
//    }
//}

public class EvenOdd{
    public static void main(String[] args) {
        int [] arr ={2,3,5,6,8};

        int evencount = 0;
        int oddcount = 0;

        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else{
                oddcount++;
            }

        }
        System.out.println("Even Numbers: " + evencount);
        System.out.println("Odd numbers: " + oddcount);

    }
}
