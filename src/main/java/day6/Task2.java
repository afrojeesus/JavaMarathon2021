package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Tesla",2015,450,9000);
        plane.setYear(2016);
        plane.setLength(455);
        plane.fillUp(7000);
        plane.info();

    }
}
