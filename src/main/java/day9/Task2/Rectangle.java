package day9.Task2;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width){
        super(color);
        this.height=height;
        this.width=width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return width;
    }

    public void setWeight(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return 2*(height+width);
    }
}
