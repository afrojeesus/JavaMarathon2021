package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Volvo");
        car.setColour("Black");
        car.setYear(2021);
        System.out.println("Car model is: " + car.getModel() + ", car colour is: " + car.getColour() + ", year of production is: " + car.getYear());

    }
}

class Car {
    private String model;
    private String colour;
    private int year;

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setColour(String userColour) {
        colour = userColour;
    }

    public String getColour() {
        return colour;
    }

    public void setYear(int userYear) {
        year = userYear;
    }

    public int getYear() {
        return year;
    }
}


