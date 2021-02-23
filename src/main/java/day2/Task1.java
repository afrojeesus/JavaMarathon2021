package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите колличество этажей: ");
        int stairs = input.nextInt();

        if (stairs > 0 && stairs < 5) {
            System.out.println("Малоэтажный дом");
        } else if (stairs > 4 && stairs < 9) {
            System.out.println("Срежнеэтажный дом");
        } else if (stairs > 8) {
            System.out.println("Многоэтыжный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
