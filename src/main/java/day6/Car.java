package day6;

class Car {
    private String model;
    private String colour;
    private int year;

    public Car (String model, String color, int year){
        this.model=model;
        this.colour=color;
        this.year=year;
    }

    public void voidInfo(){
        System.out.println("This is a Car");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear-this.year);
    }
}


