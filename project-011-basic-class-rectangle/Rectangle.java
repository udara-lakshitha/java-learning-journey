public class Rectangle {

    private double width;
    private double height;

    public Rectangle(Double width, double height) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1.0;
            System.out.println("Warning: invalid width provided, setting to 1.0");
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1.0;
            System.out.println("Warning: invalid height provided, setting to 1.0");
        }
        System.out.println("Rectangle object is created with width = " + this.width + " and height = " + this.height);
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: Cannot set width  to a non-positive value");
        }
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: Cannot set height to a non-positive value");
        }
    }

    // Included main method inside the rectangle class for simplicity (will separate the main method in future projects)
    public static void main(String[] arrgs) {
        System.out.println("--- Rectangle class demo ---");

        Rectangle rectangle1 = new Rectangle(5.0, 10.0);
        Rectangle rectangle2 = new Rectangle(3.5, 7.2);
        Rectangle rectangle3 = new Rectangle(-4.0, 12.0);

        System.out.println("\n---- Rectangle 1 ---");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter());

        System.out.println("\n--- Rectangle 2 ---");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.calculateArea());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter());

        System.out.println("\n--- Invlaid Rectangle (Defaults Applied) ---");
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Height: " + rectangle3.getHeight());
        System.out.println("Area: " + rectangle3.calculateArea());
        System.out.println("Perimeter: " + rectangle3.calculatePerimeter());

        System.out.println("\n--- Modifying rectangle 1 ---");
        System.out.println("Original width of rectangle1: " + rectangle1.getWidth());
        rectangle1.setWidth(6.0);
        rectangle1.setHeight(-5.0);
        System.out.println("New width of rectangle 1: " + rectangle1.getWidth());
        System.out.println("New height of rectangle 1: " + rectangle1.getHeight());
        System.out.println("New area of rectangle 1 : " + rectangle1.calculateArea());

        System.out.println("\n-----------------------------------");
    }
}
