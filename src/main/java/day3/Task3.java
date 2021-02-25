package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double divident;
        double divider;

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите делимое: ");
            divident = input.nextDouble();

            System.out.println("Введите делитель: ");
            divider = input.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на ноль!");
                continue;
            }
            System.out.println(divident / divider);
            System.out.println("Счетчик = " + (i + 1));

        }
        System.out.println("Программа завершила свою работу");


    }
}



