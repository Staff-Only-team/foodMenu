package com.staffOnly.food;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [StaffOnly 팀] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("4. 음식값과 인원 수를 입력받아 1인당 낼 금액");
            System.out.println("0. 종료");
            System.out.println("1. 하루동안 먹은 칼로리 합산");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가

                case 4:
                    System.out.print("음식의 값을 입력해주세요 : ");
                    int foodPrice = sc.nextInt();
                    System.out.print("인원 수를 입력해주세요 : ");
                    int peopleCount = sc.nextInt();
                    DivideCalculator divideCal = new DivideCalculator();
                    if (peopleCount == 0) {
                        System.out.println("인원은 1명 이상이어야 합니다.");
                    } else {
                        double result_4 = divideCal.divide(foodPrice, peopleCount);
                        System.out.println("1인당 " + result_4 + "원");
                    }
                    break;
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;

                case 1:
                    System.out.print("아침 칼로리: ");
                    int breakfast = sc.nextInt();
                    System.out.print("점심 칼로리: ");
                    int lunch = sc.nextInt();
                    System.out.print("저녁 칼로리: ");
                    int dinner = sc.nextInt();

                    PlusCalculator pc = new PlusCalculator();
                    // 식사만 더하는 경우
                    int m1 = pc.sumMeal(breakfast, lunch, dinner);
                    System.out.println("오늘 먹은 칼로리는 "+m1+"kcal 입니다.");

                    // 간식도 더하는 경우

                    // 간식을 입력할 것인 지를 물어보는 sout
                    // 예 / 아니오
                    // 예 를 누르면 Scanner 로 간식 입력 받기
                    // 아니오를 누르면 break 를 활용해서 메인으로 넘어가기
                    System.out.print("간식의 칼로리를 추가하시겠습니까?(예/아니오): ");
                    sc.nextLine(); // 해당 코드에서 저장 되는 입력 값 : enter 를 담는용도
                    // snackyn = 123번지
                    String snackyn = sc.nextLine();
//                    System.out.println("snackyn = " + snackyn);
                    // snackyn == "예" // 123번지 == 예
                    // 예 == 예 eq
                    if (snackyn.equals("예")) {
                        System.out.print("간식 칼로리: ");
                        int snack = sc.nextInt();
                        int m2 = pc.sumSnack(breakfast, lunch, dinner, snack);
                        System.out.print("오늘 먹은 칼로리는 "+m2+"kcal 입니다.");
                    } else{
                        break;
                    }

                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}