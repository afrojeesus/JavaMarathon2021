package day4;


import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] array2D = new int[12][8];

        int sumMax = 0;
        int sumMaxIdx = 0;

        for (int i = 0; i < array2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = rand.nextInt(50);
                sum += array2D[i][j];
            }
            if (sum >= sumMax) {
                sumMax = sum;
                sumMaxIdx = i;
            }
        }
        System.out.println(sumMaxIdx);


    }
}
