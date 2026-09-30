package com.staffOnly.food;

public class MinusCalculator {



    //6. 넘겨받은 변수를 계산 후 return으로 다시 되돌아감
    public int minus (int goal, int eaten) {
        return goal - eaten;
    }

    //4. 변수 넘겨 받음
    public String judge(int goal , int eaten) {
        //5. 넘겨받은 변수를 minus로 보냄
        minus(goal, eaten);
        int result = minus(goal, eaten);
        //7. 문장을 return으로 호출했던 main으로 ㄴ되돌림
        if (result > 0) {
            return minus(goal, eaten) + "만큼 더 드실 수 있어요";
        } else if (result < 0) {
            return -minus(goal, eaten) + "만큼 더 드셨네요.";
        }
        else {
            return "딱 맞게 드셨네요.";
        }

    }
}