package OOPs;

public class Student {
    String name;
    String schoolname;
    int id;
    int Class;

    Student(String name,String schoolname,int id,int Class)
    {
        this.name = name;
        this.schoolname = schoolname;
        this.id = id;
        this.Class = Class;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Sai","LPSS",16,10);
        Student s2 = new Student( "Vamsi","Orange County",19,9);

        s1.info();
        s2.info();

    }
    void info()
    {
        System.out.println("Name: " + name);
        System.out.println("School Name: " + schoolname);
        System.out.println("School ID: " + id);
        System.out.println("Class: " + Class);
        System.out.println("-----------------------------------------------------");
    }
}
