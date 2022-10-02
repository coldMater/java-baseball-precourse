package baseball;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BaseballGameInputTest {
    @ParameterizedTest
    @ValueSource(strings = { "123", "234", "374", "213", "739", "283" })
    void basicBehavior(String digits) {
        ThreeDigits td = BaseballGameInput.getThreeDigitsFrom(digits);
        assertEquals("" + td.digit1st + td.digit2nd + td.digit3rd, digits);
    }

    @ParameterizedTest
    @ValueSource(strings = { "112", "abc", "1234", "12", "99", "1000" })
    void throwTest(String digits) {
        assertThrows(IllegalArgumentException.class, () -> BaseballGameInput.getThreeDigitsFrom(digits));
    }
}