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
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}