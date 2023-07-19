package StringCalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class StringCheckerTest {
    @Test
    void 문자열이_음수나_숫자가_아니면_예외를_던진다() {
        assertThatThrownBy(() -> StringChecker.isNumber("A"))
                .isInstanceOf(RuntimeException.class);

        assertThatThrownBy(() -> StringChecker.isNumber("-1"))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void 문자열이_비어있는지_체크한다(){
        assertThat(StringChecker.isEmpty("")).isTrue();

        assertThat(StringChecker.isEmpty("12")).isFalse();
    }

    @Test
    void 문자열_리스트를_정수형_리스트로_반환한다(){
        assertThat(StringChecker.convertIntegerList(Arrays.asList("1", "1", "1"))).isEqualTo(Arrays.asList(1, 1, 1));
    }
}
