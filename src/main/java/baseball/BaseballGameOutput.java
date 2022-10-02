package baseball;

import java.util.ArrayList;

public class BaseballGameOutput {
    public static void printPleaseInputDigits() {
        System.out.print("숫자를 입력해주세요: ");
    }

    public static void printOneResult(BaseballGameResult result) {
        if (result.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        ArrayList<String> resultStrings = new ArrayList<>();
        if (result.getBalls() > 0) resultStrings.add(result.getBalls() + "볼");
        if (result.getStrikes() > 0) resultStrings.add(result.getStrikes() + "스트라이크");
        System.out.println(String.join(" ", resultStrings));
    }

    public static void printYouWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printWhetherRestartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
