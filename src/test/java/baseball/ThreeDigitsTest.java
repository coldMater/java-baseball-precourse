package baseball;

import baseball.digits.ThreeDigits;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ThreeDigitsTest {
    @Test
    void equals() {
        ThreeDigits td1 = new ThreeDigits(1,2,3);
        ThreeDigits td2 = new ThreeDigits(1,2,3);

        assertEquals(td1, td2);

        ThreeDigits td3 = new ThreeDigits(2,2,3);
        assertNotEquals(td1, td3);
    }
}