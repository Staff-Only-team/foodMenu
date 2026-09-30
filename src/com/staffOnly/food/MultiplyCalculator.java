package com.staffOnly.food;

import java.util.Scanner;

public class MultiplyCalculator {
        public int multi(int people_kcal, int people_count) {
            return people_kcal * people_count;
        }

        public void print(int people_kcal, int max_people) {
            int totalKcal = 0;
            for (int i = 1; i < max_people; i++) {
                totalKcal += people_kcal;
                System.out.println(i + "인분 : " + totalKcal + " kcal");
            }
        }
}
