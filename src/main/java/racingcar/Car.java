package racingcar;

public class Car {
    private final String name;

    private int distance;

    public Car(String name) {
        this.name = name;
        this.distance = 0;
    }

    public int moveForward(int randomNumber) {
        if(randomNumber >= 4) distance++;

        return this.distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " : " + "-".repeat(this.distance);
    }
}
