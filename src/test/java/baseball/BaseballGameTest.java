package baseball;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {
    @Test
    void compareTest() {
        // Ball Count Test
        BaseballGame baseballGame = new BaseballGame(4, 6, 9);
        ThreeDigits inputThreeDigits = new ThreeDigits(4, 7, 8);
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 0);
        assertFalse(result.isNothing());

        // Strike Count Test
        BaseballGame baseballGame2 = new BaseballGame(4, 3, 8);
        ThreeDigits inputThreeDigits2 = new ThreeDigits(3, 4, 8);
        BaseballGameResult result2 = baseballGame2.compare(inputThreeDigits2);
        assertEquals(result2.getStrikes(), 1);
        assertEquals(result2.getBalls(), 2);
        assertFalse(result2.isNothing());

        // Nothing Test
        BaseballGame baseballGame3 = new BaseballGame(4, 5, 6);
        ThreeDigits inputThreeDigits3 = new ThreeDigits(1, 2, 3);
        BaseballGameResult result3 = baseballGame3.compare(inputThreeDigits3);
        assertEquals(result3.getStrikes(), 0);
        assertEquals(result3.getBalls(), 0);
        assertTrue(result3.isNothing());
    }
}
