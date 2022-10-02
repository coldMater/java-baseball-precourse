package baseball;

public class BaseballGame {
    private ThreeDigits targetThreeDigits;

    BaseballGame(int digit1st, int digit2nd, int digit3rd) {
        this.targetThreeDigits = new ThreeDigits(digit1st, digit2nd, digit3rd);
    }

    BaseballGameResult compare(ThreeDigits inputDigits) {
        return new BaseballGameResult(this.countStrikes(inputDigits), this.countBalls(inputDigits));
    }

    private int countStrikes(ThreeDigits inputDigits) {
        int strikes = 0;
        if (this.targetThreeDigits.digit1st == inputDigits.digit1st) strikes++;
        if (this.targetThreeDigits.digit2nd == inputDigits.digit2nd) strikes++;
        if (this.targetThreeDigits.digit3rd == inputDigits.digit3rd) strikes++;
        return strikes;
    }

    private int countBalls(ThreeDigits inputDigits) {
        int balls = 0;
        if (this.targetThreeDigits.digit1st == inputDigits.digit2nd || this.targetThreeDigits.digit1st == inputDigits.digit3rd) balls++;
        if (this.targetThreeDigits.digit2nd == inputDigits.digit1st || this.targetThreeDigits.digit2nd == inputDigits.digit3rd) balls++;
        if (this.targetThreeDigits.digit3rd == inputDigits.digit1st || this.targetThreeDigits.digit3rd == inputDigits.digit2nd) balls++;
        return balls;
    }
}
