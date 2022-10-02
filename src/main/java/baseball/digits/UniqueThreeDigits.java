package baseball.digits;

import camp.nextstep.edu.missionutils.Randoms;

public class UniqueThreeDigits extends ThreeDigits {
    public UniqueThreeDigits() {
        super(Randoms.pickNumberInRange(1, 9), Randoms.pickNumberInRange(1, 9), Randoms.pickNumberInRange(1, 9));
        while (getDigit1st() == digit2nd) digit2nd = Randoms.pickNumberInRange(1, 9);
        while (getDigit1st() == digit3rd || getDigit2nd() == digit3rd) digit3rd = Randoms.pickNumberInRange(1, 9);
    }
}
