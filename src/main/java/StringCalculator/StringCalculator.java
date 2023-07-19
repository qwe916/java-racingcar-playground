package StringCalculator;

import java.util.List;

public class StringCalculator {
    public static Integer calculate(String input) {
        List<String> splitText = StringSeparator.separateDelimiter(input);

        List<Integer> IntegerList = StringChecker.convertIntegerList(splitText);

        return IntegerList.stream().reduce(0, Integer::sum);
    }

}
