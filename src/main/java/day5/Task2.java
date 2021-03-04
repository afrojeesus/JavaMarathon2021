package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike();
        System.out.println("Model of the motornike is: " + bike.getModel() + ", it's color is: " + bike.getColor() + ", and it's production year is: " + bike.getYear());

    }
}

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike() {
        this.model = "Harley Davidson";
        this.color = "Green";
        this.year = 1967;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
