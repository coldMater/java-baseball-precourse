package baseball;

import java.util.Objects;

public class ThreeDigits {
    int digit1st;
    int digit2nd;
    int digit3rd;

    ThreeDigits(int digit1st, int digit2nd, int digit3rd) {
        this.digit1st = digit1st;
        this.digit2nd = digit2nd;
        this.digit3rd = digit3rd;
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
