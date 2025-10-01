import java.util.Scanner;
public class Sum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int[] arr = {0,1,2,3,4,5};
        int sum = 0;

        for(int num : arr)
        sum += num;
        {
            System.out.println("Sum: " + sum);
        }
    }
}
