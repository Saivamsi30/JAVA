package OOPs;

class Species{
    void fly()
    {
        System.out.println("Flying....");
    }
}




public class Animal extends Species{
    void eat()
    {
        System.out.println("Animal is eating");
    }
    void Sound()
    {
        System.out.println("MAking sound turrrrr turrrrr");
    }

    @Override
    void fly() {
        System.out.println("Not supported");
    }
}

class dog extends Animal
{
    @Override
    void Sound() {
        System.out.println("Barking");
    }
}
