package HomeWork;

public class Taxi extends Car {
    int maxCitySpeed = 70;
    String color = "Желтый";
    String price = " 1$ за 1км ";

    public void stop() {
        speed = 0;
    }

    public void drive() {
        speed = 60;
    }
}
