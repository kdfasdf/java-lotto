# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 기능 목록
- [x] 입력 화면(InputView)
    - [x] 구매 금액 입력
    - [x] 당첨번호 입력
- [x] 로또 생성(LottoGenerator)
  - [x] shuffle()를 통한 생성(LottoShuffleGenerator)
- [x] 당첨 확인(Lottos)
  - [x] 당첨 조건(Lotto)
    - [x] 보너스 번호에 의한 2, 3등 구분
  - [x] 당첨 통계
  - [x] 수익률 계산
- [x] 로또 구매 개수 계산(Lottos)
- [x] 당첨 화면(ResulView)

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)