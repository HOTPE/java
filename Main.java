import java.util.Scanner;
import java.util.Random;
import java.util.Locale;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Car[] cars ={new Car("Mustang", "Red"),
                     new Car("BMW", "Blue"),
                     new Car("Porsche", "Yellow")};
        for(Car car : cars)
        {
            car.drive();
        }
    }
}
