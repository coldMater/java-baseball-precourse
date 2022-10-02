package baseball;

import baseball.digits.ThreeDigits;
import baseball.digits.UniqueThreeDigits;

public class BaseballGame {
    private UniqueThreeDigits targetThreeDigits;

    BaseballGame(UniqueThreeDigits threeDigits) {
        this.targetThreeDigits = threeDigits;
    }

    BaseballGameResult compare(ThreeDigits inputDigits) {
        return new BaseballGameResult(this.countStrikes(inputDigits), this.countBalls(inputDigits));
    }

    private int countStrikes(ThreeDigits inputDigits) {
        int strikes = 0;
        if (this.targetThreeDigits.getDigit1st() == inputDigits.getDigit1st()) strikes++;
        if (this.targetThreeDigits.getDigit2nd() == inputDigits.getDigit2nd()) strikes++;
        if (this.targetThreeDigits.getDigit3rd() == inputDigits.getDigit3rd()) strikes++;
        return strikes;
    }

    private int countBalls(ThreeDigits inputDigits) {
        int balls = 0;

        if (inputDigits.getDigit1st() == targetThreeDigits.getDigit2nd() || inputDigits.getDigit1st() == targetThreeDigits.getDigit3rd()) balls++;
        if (inputDigits.getDigit2nd() == targetThreeDigits.getDigit1st() || inputDigits.getDigit2nd() == targetThreeDigits.getDigit3rd()) balls++;
        if (inputDigits.getDigit3rd() == targetThreeDigits.getDigit1st() || inputDigits.getDigit3rd() == targetThreeDigits.getDigit2nd()) balls++;
        return balls;
    }
}
