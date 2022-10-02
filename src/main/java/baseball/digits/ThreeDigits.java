package baseball.digits;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ThreeDigits {
    private int digit1st;
    protected int digit2nd;
    protected int digit3rd;

    public ThreeDigits(int digit1st, int digit2nd, int digit3rd) {
        this.digit1st = digit1st;
        this.digit2nd = digit2nd;
        this.digit3rd = digit3rd;
    }

    public int getDigit1st() {
        return digit1st;
    }

    public int getDigit2nd() {
        return digit2nd;
    }

    public int getDigit3rd() {
        return digit3rd;
    }

    public List<Integer> asList() {
        List<Integer> list = new ArrayList<>();

        list.add(digit1st);
        list.add(digit2nd);
        list.add(digit3rd);

        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeDigits that = (ThreeDigits) o;
        return digit1st == that.digit1st && digit2nd == that.digit2nd && digit3rd == that.digit3rd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(digit1st, digit2nd, digit3rd);
    }
}
