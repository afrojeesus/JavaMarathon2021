package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.println("Введите делимое: ");
            double divident = input.nextDouble();

            System.out.println("Введите делитель: ");
            double divider = input.nextDouble();

            if (divider == 0) {
                break;
            }
            System.out.println(divident / divider);

        }
        System.out.println("Работа программы завершена");


    }
}
