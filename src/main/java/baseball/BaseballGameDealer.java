package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class BaseballGameDealer {
    BaseballGame baseballGame;
    public void start() {
        do {
            this.runOneGame();
        } while (askRestartGame());
    }

    private void runOneGame() {
        setNewGame();
        while (true) {
            ThreeDigits td = readDigits();
            BaseballGameResult result = this.baseballGame.compare(td);
            BaseballGameOutput.printOneResult(result);
            if (result.isWin()) {
                BaseballGameOutput.printYouWin();
                break;
            }
        }
    }

    private void setNewGame() {
        List<Integer> numList = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        this.baseballGame = new BaseballGame(numList.get(0), numList.get(1), numList.get(2));
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
