package baseball;

import baseball.digits.ThreeDigits;
import baseball.digits.UniqueThreeDigits;
import camp.nextstep.edu.missionutils.Randoms;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BaseballGameTest {
    @Test
    void compareTest() {
        // Ball Count Test
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit1st());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 2);
        assertFalse(result.isNothing());
        assertFalse(result.isWin());

        // Strike Count Test
        UniqueThreeDigits targetThreeDigits2 = new UniqueThreeDigits();
        BaseballGame baseballGame2 = new BaseballGame(targetThreeDigits2);
        ThreeDigits inputThreeDigits2 = new ThreeDigits(targetThreeDigits2.getDigit1st(), targetThreeDigits2.getDigit1st(), targetThreeDigits2.getDigit3rd());
        BaseballGameResult result2 = baseballGame2.compare(inputThreeDigits2);
        assertEquals(result2.getStrikes(), 2);
        assertEquals(result2.getBalls(), 1);
        assertFalse(result2.isNothing());
        assertFalse(result2.isWin());

        // Nothing Test
        UniqueThreeDigits targetThreeDigits3 = new UniqueThreeDigits();
        BaseballGame baseballGame3 = new BaseballGame(targetThreeDigits3);
        List<Integer> unusedNumberList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (targetThreeDigits3.getDigit1st() == i || targetThreeDigits3.getDigit2nd() == i || targetThreeDigits3.getDigit3rd() == i)
                continue;
            unusedNumberList.add(i);
        }
        ThreeDigits inputThreeDigits3 = new ThreeDigits(Randoms.pickNumberInList(unusedNumberList), Randoms.pickNumberInList(unusedNumberList), Randoms.pickNumberInList(unusedNumberList));
        BaseballGameResult result3 = baseballGame3.compare(inputThreeDigits3);
        assertEquals(result3.getStrikes(), 0);
        assertEquals(result3.getBalls(), 0);
        assertTrue(result3.isNothing());
        assertFalse(result3.isWin());

        // Win Test
        UniqueThreeDigits targetThreeDigits4 = new UniqueThreeDigits();
        BaseballGame baseballGame4 = new BaseballGame(targetThreeDigits4);
        ThreeDigits inputThreeDigits4 = new ThreeDigits(targetThreeDigits4.getDigit1st(), targetThreeDigits4.getDigit2nd(), targetThreeDigits4.getDigit3rd());
        BaseballGameResult result4 = baseballGame4.compare(inputThreeDigits4);
        assertEquals(result4.getStrikes(), 3);
        assertEquals(result4.getBalls(), 0);
        assertFalse(result4.isNothing());
        assertTrue(result4.isWin());
    }
}
