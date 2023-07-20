package racingcar;

import java.util.Scanner;

public class RacingCarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");

        RacingCar racingCar = new RacingCar(scanner.next());

        System.out.println("시도할 회수는 몇회인가요?");

        int tryNumber = scanner.nextInt();

        System.out.println("실행 결과");

        for (int i = 0; i <tryNumber ; i++) {
            System.out.println(racingCar.play());
        }

        System.out.println(racingCar.result());
    }
}
