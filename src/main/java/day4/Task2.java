package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];

        int max = 0;
        int min = 10000;
        int num0 = 0;
        int sum0 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }

        for (int element : array) {
            if (element > max) max = element;
            if (element < min) min = element;
            if (element % 10 == 0) {
                num0++;
                sum0 += element;
            }


        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Amount of numbers that ends on 0: " + num0);
        System.out.println("Sum of numbers that ends on 0: " + sum0);


    }
}
