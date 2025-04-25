public abstract class Shape {
    private String color;

    public Shape(String color) {
        System.out.println("Shape constructor called for color: " + color);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape color: " + getColor());
        System.out.println("Calculated Area: " + calculateArea());
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
}