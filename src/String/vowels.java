package String;

public class vowels {
    public static void main(String[] args) {
        String s1 = "saivamsi";

        int v=0,c=0;

        for(char c1:s1.toCharArray())
        {
            if("aeiou".indexOf(c1) != -1)
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("Vowel count: " + v);
        System.out.println("Consonant count: " + c);
    }
}
