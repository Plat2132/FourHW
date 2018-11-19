package HomeWork;

public abstract class Car {
    int speed;
    int babySeat;

    public void setBabySeat(int babySeat) {
        this.babySeat = babySeat;
    }

    public int getBabySeat() {
        return babySeat;
    }

    abstract void stop();

    abstract void drive();

}
