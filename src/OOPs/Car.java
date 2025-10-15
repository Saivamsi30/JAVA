package OOPs;

public class Car {

    String name;

    String color;  /*instances*/

    int speed;

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.speed = 100;
        car1.color = "White";
        car1.Run();


    }
    public void Run()
    {
        System.out.println("Speed of the Car is: " + speed);
        System.out.println("Color of the Car is: "+color);
    }

}
