package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RacingCar {
    private final List<Car> cars = new ArrayList<>();

    public RacingCar(String carNames) {
        String[] carNameList = carNames.split(",");
        for (String carName: carNameList
             ) {
            addCar(new Car(carName));
        }
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }


    public String play() {
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new Random();

        cars.forEach(car -> {
            car.moveForward(random.nextInt(9));
            
            stringBuilder.append(car).append("\n");
        });

        return stringBuilder.toString();
    }

    public String result() {
        int maxDistance = cars.stream().mapToInt(Car::getDistance)
                .max().getAsInt();

        List<Car> winnerCars = cars.stream().filter(car -> car.getDistance() == maxDistance)
                .collect(Collectors.toList());

        if (winnerCars.size() == 1) {
            return winnerCars.get(0).getName() + "가 최종 우승했습니다";
        }

        String winnerCarsName = winnerCars.stream().map(Car::getName).collect(Collectors.joining(","));

        return winnerCarsName + "가 최종 우승했습니다";
    }
}
