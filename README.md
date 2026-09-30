# 자취생 식단 계산기 (1팀)

혼자 밥 해 먹는 사람을 위한 계산기입니다. 하루 칼로리를 관리하고, 재료를 n인분으로 환산하고, 배달비를 나눕니다.

## 팀원과 담당 기능

| 메뉴 | 기능                 | 담당          | 클래스             | 메소드 이름   | Issue | PR  |
|------|----------------------|---------------|--------------------|---------------|-------|-----|
| 1    | 오늘 먹은 칼로리 합계 | 류다연 (팀장) | PlusCalculator     | public int sumMeal(int b, int l, int d)/ public int sumSnack(int b, int l, int d, int s)| #1    | #5  |
| 2    | 남은 칼로리          | 조연익        | MinusCalculator    | public int Minus (int goal, int eaten)/ public String Judge (int goal, int eaten) | #2    | #6  |
| 3    | n인분 칼로리 표      | 이서연        | MultiplyCalculator | public int multi(int people_kcal, int people_count)/ public void print(int people_kcal, int max_people) | #3    | #7  |
| 4    | 배달 더치페이        | 양승빈        | DivideCalculator   | public double divide(int foodPrice, int peopleCount) | #4    | #8  |

## 실행 화면

<img width="702" height="1074" alt="image" src="https://github.com/user-attachments/assets/149d6bac-ace9-4e2f-99df-5e41cde7a6fc" />


## 충돌 해결 기록

- PR #12 : 같은 클래스에서 case 1, 2, 3, 4의 코드를 작성하여서 충돌이 일어났다.

## 협업하며 배운 점

- 풀 푸쉬 머지 그리고 리버트를 신중하게 하자.
