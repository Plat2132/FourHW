package HomeWork;

import java.util.Objects;

public class Ford extends Taxi {
int numberSeats;
int maxSpeed;

    public Ford(int numberSeats, int babySeat, int maxSpeed) {
        this.numberSeats = numberSeats;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return numberSeats == ford.numberSeats &&
                babySeat == ford.babySeat &&
                maxSpeed == ford.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberSeats, babySeat, maxSpeed);
    }

    @Override
    public String toString() {
        return "Ford{" +
                "numberSeats=" + numberSeats +
                ", babySeat=" + babySeat +
                ", maxSpeed=" + maxSpeed +
                ", maxCitySpeed=" + maxCitySpeed +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }


}
