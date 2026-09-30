package com.staffOnly.food;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;

                    case 2:
                    // 1. 변수 설정
                    System.out.println("목표 칼로리 : ");
                    int goal = sc.nextInt();
                    System.out.println("먹은 칼로리 : ");
                    int eaten = sc.nextInt();

                    //2. 객체 생성
                    MinusCalculator minus = new MinusCalculator();

                    //3. minus.judge(goal, eaten);으로 변수 넘김, string은 형태 이름은 result로 설정
                    String result = minus.judge(goal, eaten);

                    //8. 돌아온 문장을 출력

                        System.out.println(result);
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}