package baseball;

import baseball.digits.ThreeDigits;
import baseball.digits.UniqueThreeDigits;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UniqueThreeDigitsTest {
    @Test
    void uniqueTest() {
        for (int i = 0; i < 9 * 9 * 9; i++) {
            ThreeDigits three = new UniqueThreeDigits();
            assertNotEquals(three.getDigit1st(), three.getDigit2nd());
            assertNotEquals(three.getDigit2nd(), three.getDigit3rd());
            assertNotEquals(three.getDigit1st(), three.getDigit3rd());
        }
    }
}