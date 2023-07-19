package StringCalculator;

import java.util.ArrayList;
import java.util.List;

public class StringChecker {
    public static List<Integer> convertIntegerList(List<String> splitText) {
        List<Integer> textToInteger = new ArrayList<>();

        for (String text : splitText
        ) {
            isNumber(text);

            if (isEmpty(text)) {
                text = "0";
            }

            textToInteger.add(Integer.parseInt(text));
        }

        return textToInteger;
    }

    public static void isNumber(String text) {
        if (!text.matches("\\d+") || Integer.parseInt(text) < 0) {
            throw new RuntimeException("잘못된 입력입니다.");
        }
    }

    public static boolean isEmpty(String text) {
        return text.length() == 0;
    }
}
