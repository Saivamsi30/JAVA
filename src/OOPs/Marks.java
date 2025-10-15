package OOPs;

public class Marks {
    String name;
    int English;
    int Hindi;
    int Physics;
    int Chemistry;
    int Maths;

    Marks(String name,int English,int Hindi,int Physics,int Chemistry,int Maths)
    {
        this.name = name;
        this.English = English;
        this.Hindi = Hindi;
        this.Physics = Physics;
        this.Chemistry = Chemistry;
        this.Maths = Maths;
    }

    void getmarks()
    {
        System.out.println("Name: " + name);
        System.out.println("English: " + English);
        System.out.println("Hindi: " + Hindi);
        System.out.println("Physics: " + Physics);
        System.out.println("Chemistry: " + Chemistry);
        System.out.println("Maths: " + Maths);
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        Marks m1 = new Marks("Sai",90,87,85,82,86);
        Marks m2 = new Marks("Vamsi",92,90,81,79,89);
        Marks m3 = new Marks("Rohith",90,89,88,87,86);


        m1.getmarks();
        m2.getmarks();
        m3.getmarks();
    }
}
