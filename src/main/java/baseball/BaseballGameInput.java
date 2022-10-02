package baseball;

import baseball.digits.ThreeDigits;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGameInput {
    public static ThreeDigits readThreeDigits() {
        String input = Console.readLine();
        try {
            return getThreeDigitsFrom(input);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean readRestartGame() {
        String input = Console.readLine();
        if ("1".equals(input)) return true;
        if ("2".equals(input)) return false;
        throw new IllegalArgumentException();
    }

    public static ThreeDigits getThreeDigitsFrom(String digits) {
        int parsedDigits = Integer.parseInt(digits);
        if (!(parsedDigits >= 111 && parsedDigits <= 999)) throw new IllegalArgumentException();
        int digit1st = parsedDigits / 100;
        int digit2nd = (parsedDigits % 100) / 10;
        int digit3rd = (parsedDigits % 10);
        if (digit1st == digit2nd || digit2nd == digit3rd || digit3rd == digit1st)
            throw new IllegalArgumentException(); // 해당 검증은 ThreeDigits 의 생성자로 들어가는 것이 적절한가?
        return new ThreeDigits(digit1st, digit2nd, digit3rd);
    }
}
