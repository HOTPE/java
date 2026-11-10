public class Car {
    String car;
    String color;

    Car(String car, String color)
    {
        this.car = car;
        this.color = color;
    }
    void drive()
    {
        System.out.println("You drive the " + car + " " + color);
    }

}
