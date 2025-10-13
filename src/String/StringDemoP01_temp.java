package String;

public class StringDemoP01 {
    public static void main(String[] args) {
        String s1 = new String("Sai Vamsi");
        String s2 = "Sai Vamsi";
        String s3 = "Sai Vamsi";
        String s5 = "Sai Vamsi";
        String s6 = new String("Sai Vamsi");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());

    }
}
