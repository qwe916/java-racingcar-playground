package StringCalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
    @Test
    void 문자열_구분하여_덧셈한다() {
        assertThat(StringCalculator.calculate("//;\n1;2;3")).isEqualTo(6);

        assertThat(StringCalculator.calculate("1,2:3")).isEqualTo(6);
    }
}
