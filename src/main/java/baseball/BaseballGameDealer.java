package baseball;

import baseball.digits.ThreeDigits;
import baseball.digits.UniqueThreeDigits;

public class BaseballGameDealer {
    BaseballGame baseballGame;
    public void start() {
        do {
            this.runOneGame();
        } while (askRestartGame());
    }

    private void runOneGame() {
        setNewGame();
        boolean isWin= false;
        while (!isWin) {
            ThreeDigits td = readDigits();
            BaseballGameResult result = this.baseballGame.compare(td);
            BaseballGameOutput.printOneResult(result);
            isWin = result.isWin();
        }
        BaseballGameOutput.printYouWin();
    }

    private void setNewGame() {
        this.baseballGame = new BaseballGame(new UniqueThreeDigits());
        // System.out.printf("Debug Only Target Number:  %d%d%d%s", numList.get(0), numList.get(1), numList.get(2), System.lineSeparator());
    }

    private ThreeDigits readDigits() {
        BaseballGameOutput.printPleaseInputDigits();
        return BaseballGameInput.readThreeDigits();
    }

    private boolean askRestartGame() {
        BaseballGameOutput.printWhetherRestartGame();
        return BaseballGameInput.readRestartGame();
    }
}
