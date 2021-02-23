package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число A: ");
        int a = input.nextInt();

        System.out.println("Введите число B: ");
        int b = input.nextInt();

        while (a <= b) {

            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
            a++;


        }


    }
}
