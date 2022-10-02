package baseball;

public class BaseballGameDealer {
    public void start() {
        readDigits();
    }

    private ThreeDigits readDigits() {
        BaseballGameOutput.printPleaseInputDigits();
        return BaseballGameInput.readThreeDigits();
    }
}
