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
    void countTest1() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit1st());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 1);
        assertEquals(result.getBalls(), 2);
        assertFalse(result.isNothing());
        assertFalse(result.isWin());
    }

    @Test
    void countTest2() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit3rd());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 2);
        assertEquals(result.getBalls(), 1);
        assertFalse(result.isNothing());
        assertFalse(result.isWin());
    }

    @Test
    void countTest3() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(targetThreeDigits.getDigit2nd(), targetThreeDigits.getDigit3rd(), targetThreeDigits.getDigit1st());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 0);
        assertEquals(result.getBalls(), 3);
        assertFalse(result.isNothing());
        assertFalse(result.isWin());
    }

    @Test
    void countTest4() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(this.pickRandomUnusedNumber(targetThreeDigits), this.pickRandomUnusedNumber(targetThreeDigits), targetThreeDigits.getDigit1st());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 0);
        assertEquals(result.getBalls(), 1);
        assertFalse(result.isNothing());
        assertFalse(result.isWin());
    }

    @Test
    void nothingTest() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(this.pickRandomUnusedNumber(targetThreeDigits), this.pickRandomUnusedNumber(targetThreeDigits), this.pickRandomUnusedNumber(targetThreeDigits));
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 0);
        assertEquals(result.getBalls(), 0);
        assertTrue(result.isNothing());
        assertFalse(result.isWin());
    }

    @Test
    void winTest() {
        UniqueThreeDigits targetThreeDigits = new UniqueThreeDigits();
        BaseballGame baseballGame = new BaseballGame(targetThreeDigits);
        ThreeDigits inputThreeDigits = new ThreeDigits(targetThreeDigits.getDigit1st(), targetThreeDigits.getDigit2nd(), targetThreeDigits.getDigit3rd());
        BaseballGameResult result = baseballGame.compare(inputThreeDigits);
        assertEquals(result.getStrikes(), 3);
        assertEquals(result.getBalls(), 0);
        assertFalse(result.isNothing());
        assertTrue(result.isWin());
    }

    private int pickRandomUnusedNumber(ThreeDigits threeDigits) {
        List<Integer> unusedNumberList = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (threeDigits.getDigit1st() == i || threeDigits.getDigit2nd() == i || threeDigits.getDigit3rd() == i) continue;
            unusedNumberList.add(i);
        }
        return Randoms.pickNumberInList(unusedNumberList);
    }
}
