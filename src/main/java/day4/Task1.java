package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size if array: ");
        int n = input.nextInt();
        int[] array = new int[n];

        int num8 = 0;
        int num1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            if (array[i] > 8) num8++;
            if (array[i] == 1) num1++;
            if (array[i] % 2 == 0) even++;
            if (array[i] % 2 != 0) odd++;
            sum += array[i];


        }
        System.out.println(Arrays.toString(array));
        System.out.println("Array length: " + array.length);
        System.out.println("Nums >8: " + num8);
        System.out.println("Nums equal 1: " + num1);
        System.out.println("Even nums: " + even);
        System.out.println(("Odd nums: " + odd));
        System.out.println("Sum of all elements of array: " + sum);


    }
}