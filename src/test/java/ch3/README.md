# 자동차 경주

## 기능 요구사항
주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
---

## 구현 기능 목록

- [x] 핵심 로직 기능
  - [x] 자동차 테스트
    - [x] 자동차는 현재 자기 위치를 가진다.
    - [x] 자동차는 랜덤 숫자를 받으면 움직인다.
      - [x] 자동차는 랜덤 숫자가 4 이상이면 전진한다.
      - [x] 자동차는 랜덤 숫자가 4 미만이면 멈춘다.
  - [x] 자동차 레이스 테스트
    - [x] 자동차 경주는 InputView와 ResultView Class 받아 만들어진다
    - [x] 자동차 경주는 자동차 갯수를 받으면 해당 갯수만큼 자동차가 생긴다,
    - [x] 경주의 각 자동차들은 각각의 랜덤 숫자를 가진다.
    - [x] 각 시행마다 랜덤 숫자는 변한다.
- [x] UI 로직 기능
  - [x] InputView
    - [x] 해당하는 요청 문구을 띄우고, 값을 받습니다.
  - [x] ResultView
    - [x] 시행한 결과를 띄워줍니다.