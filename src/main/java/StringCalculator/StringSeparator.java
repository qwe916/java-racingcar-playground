package StringCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSeparator {
    public static List<String> separateDelimiter(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);

        if (m.find()) {
            String delimiter = m.group(1);

            List<String> splitText = Arrays.asList(m.group(2).split(delimiter));

            return splitText;
        }

        List<String> splitText = Arrays.asList(text.split(",|:"));

        return splitText;
    }
}
