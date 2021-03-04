package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[100];

        int sumMax = 0;
        int sumMaxIdx = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
                if (sum > sumMax) {
                    sumMax = sum;
                    sumMaxIdx = i;
                }
            }
        }
        System.out.println(sumMax);
        System.out.println(sumMaxIdx);


    }
}
