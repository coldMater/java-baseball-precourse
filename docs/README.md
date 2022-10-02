# 구현할 기능 목록
## 기능 요구사항
- [ ] BaseballGame 구현 (Model)
    - 생성자: 인자 없음, targetThreeDigits 에 맞춰야하는 세자리의 수(ThreeDigits) 생성
    - private targetThreeDigits: ThreeDigits
    - compare(other ThreeDigits): BaseballGameResult
- [x] BaseballGameInput 구현 (View - input)
- [x] BaseballGameOutput 구현 (view- output)
- [x] BaseballGameDealer 구현 (Controller)
    - [ ] private BaseballGame
    - [x] start(): void
- [x] ThreeDigits 구현 (VO?)
    - 생성자: 세 자리의 숫자를 입력받아 객체화
    - 멤버변수: int digitFirst, int digitSecond, int digitThird
    - equals(ThreeDigits otherThreeDigits): boolean 오버라이드
    - hashCode(): int 오버라이드
- [ ] BaseballGameResult 구현 (DTO?)
    - 생성자: (int strike, int ball, int nothing) 카운트
    - 각 멤버변수는 getter 만 가짐
## 프로그래밍 요구사항
### 제약사항1
- [ ] JDK8 동작 확인
- [ ] 잘못된 값의 입력시 IllegalArgumentException 발생 후 종료
- [ ] JDk 기본 Scanner 사용하지 않았는지 확인
- [ ] src/test/java baseball.ApplicationTest 2개의 테스트 통과 확인
    - gradlew.bat
### 제약사항2
- [ ] indent depth 는 1이어야 한다.
- [ ] stream 사용하지 않아야 한다.
- [ ] else 예약어는 사용하지 않는다.
- [ ] 함수는 10라인을 넘어가지 않는다.
### 단위 테스트
- [ ] 도메인 로직 단위 테스트 구현
