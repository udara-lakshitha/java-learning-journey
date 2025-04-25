public class Circle extends Shape{
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 1.0;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle[Color: " + getColor() + ", Radius: " + getRadius() + "]";
    }
}
