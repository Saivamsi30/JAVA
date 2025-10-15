package OOPs;

public class Course {
    String name;

    int duration;

    String skills;


    Course()
    {
        System.out.println("Constructor Created");
    }
    public static void main(String[] args) {
        System.out.println("Before Object create");
        Course c1 = new Course();
        System.out.println("After Object create");

        c1.learn();

    }

    void learn()
    {
        System.out.println("We are learning " +name );
    }
}
