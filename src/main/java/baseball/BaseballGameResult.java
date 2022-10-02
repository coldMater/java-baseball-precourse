package baseball;

public class BaseballGameResult {
    private int strikes;
    private int balls;
    private boolean isNothing;
    private boolean isWin;

    BaseballGameResult(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
        if (strikes == 0 & balls == 0) this.isNothing = true;
        if (strikes == 3) this.isWin = true;
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

    public boolean isWin() {
        return isWin;
    }
}
