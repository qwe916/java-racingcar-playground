package StringCalculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class StringSeparatorTest {
    @Test
    void 커스텀_구분자가_없는_문자열_구분(){
        List<String> splitText = StringSeparator.separateDelimiter("1:2,3");
        assertThat(splitText).isEqualTo(Arrays.asList("1","2","3"));
    }

    @Test
    void 커스텀_구분자가_있는_문자열_구분(){
        List<String> splitText = StringSeparator.separateDelimiter("//`\n1`2`3");
        assertThat(splitText).isEqualTo(Arrays.asList("1","2","3"));
    }
}
