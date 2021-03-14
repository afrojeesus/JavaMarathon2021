package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike();
        bike.voidInfo();
        System.out.println(bike.yearDifference(2021));

        Car car = new Car("Shevrolet","Blue",1978);
        car.voidInfo();
        System.out.println(car.yearDifference(2021));


    }
}
