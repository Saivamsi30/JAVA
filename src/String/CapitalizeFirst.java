package String;

public class CapitalizeFirst {
    public static void main(String[] args) {
        String str = "sai Vamsi";

        String result = str.substring(0,1).toUpperCase() + str.substring(1);

        System.out.println(result);
    }
}
