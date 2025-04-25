public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        System.out.println("Rectangle constructor called");
        this.width = width > 0 ? width : 1.0;
        this.height = height > 0 ? height : 1.0;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        return this.width *  this.height;
    }

    @Override
    public String toString() {
        return "Rectangle [Color: " + getColor() + ", Width: " + getWidth() + ", Height: " + getHeight() + "]";
    }
}
