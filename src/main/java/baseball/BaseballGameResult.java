package baseball;

public class BaseballGameResult {
    private int strikes;
    private int balls;
    private boolean isNothing;

    BaseballGameResult(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
        if (strikes == 0 & balls == 0) this.isNothing = true;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }

    public boolean isNothing() {
        return isNothing;
    }
}
