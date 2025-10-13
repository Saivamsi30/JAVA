
import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {

        Calc obj = new Calc();
        obj.startCalc();
    }

        public void startCalc()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calc Menu");
            System.out.println("Enter 1 - Addition");
            System.out.println("Enter 2 - Subtraction");
            System.out.println("Enter 3 - Multiplication");
            System.out.println("Enter 4 - Division");

            int choice = sc.nextInt();

            System.out.println("Enter 1st Number: ");
            double num1 = sc.nextInt();

            System.out.println("Enter 2nd Number: ");
            double num2 = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Result" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: "+ (num1 * num2));
                    break;
                case 4:
                    if(num2 != 0)
                    {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    else{
                        System.out.println("Error: Division with zero is not possible");
                        break;
                    }
                default:
                    System.out.println("No Data Found");
                    break;
            }

        }
    }









//import java.util.Scanner;
//public class Calc {
//    public static void main(String[] args)
//    {
//        Calc obj = new Calc();
//        obj.startcalc();
//    }
//    public void startcalc()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Calculator Menu");
//        System.out.println("Enter 1 - Addition");
//        System.out.println("Enter 2 - Multiplication");
//        System.out.println("Enter 3 - Subtraction");
//        System.out.println("Enter 4 - Division");
//
//        int choice = sc.nextInt();
//        System.out.println("Enter 1st Number: ");
//        double num1 = sc.nextDouble();
//
//        System.out.println("Enter 2nd Number: ");
//        double num2 = sc.nextDouble();
//
//
//        switch(choice)
//        {
//            case 1:
//                System.out.println("Result: " + (num1 + num2));
//                break;
//            case 2:
//                System.out.println("Result: " + (num1 * num2));
//                break;
//            case 3:
//                System.out.println("Result: " + (num1 - num2));
//                break;
//            case 4:
//                if(num2 != 0)
//                {
//                    System.out.println("Result: : " + (num1 / num2));
//                }
//                else{
//                    System.out.println("Error:Division by zero is not allowed");
//                }
//                break;
//            default:
//                System.out.println("No Data Found");
//
//        }
//
//
//    }
//}
//
