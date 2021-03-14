package day6;


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
    public void voidInfo(){
        System.out.println("This is Motorbike");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear-this.year);
    }
}
