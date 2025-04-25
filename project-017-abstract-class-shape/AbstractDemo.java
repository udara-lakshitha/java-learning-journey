public class AbstractDemo {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");

        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("\n--- Processing shapes polymorphically ---");

        System.out.println("\nCircle Info");
        System.out.println(circle);
        System.out.println("Color (via getter): " + circle.getColor());
        System.out.println("Area (via specific method): " + circle.calculateArea());
        circle.displayInfo();

        System.out.println("\nRectangle info");
        System.out.println(rectangle);
        System.out.println("Color (via getter): " + rectangle.getColor());
        System.out.println("Area (via specific method): " + rectangle.calculateArea());
        rectangle.displayInfo();

        System.out.println("\nUsing an array");
        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        for (Shape shape : shapes) {
            System.out.println("\nProcessing shape from array: ");
            System.out.println("Object typr: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            shape.displayInfo();
        }

        System.out.println("\n------------------------------------------");
    }    
}
