# Project 017: Abstract Class - Shape

This project demonstrates the use of abstract classes and methods in Java, fundamental concepts for achieving abstraction in Object-Oriented Programming. An abstract `Shape` class defines a common interface and partial implementation for concrete shape subclasses like `Circle` and `Rectangle`.

## Core Concepts Learned

*   **`abstract` Keyword:** Used for classes that cannot be instantiated and methods without implementation.
*   **Abstract Class:**
    *   Cannot be instantiated directly (`new Shape()` is illegal).
    *   Designed to be extended by subclasses.
    *   Can contain abstract methods, concrete methods, fields, and constructors.
*   **Abstract Method:**
    *   Declared with `abstract`, has no method body (e.g., `public abstract double calculateArea();`).
    *   Must be implemented (`@Override`) by any concrete subclass.
    *   Defines a contract that subclasses must fulfill.
*   **Concrete Class:** A non-abstract subclass that provides implementations for all inherited abstract methods.
*   **Polymorphism:** Using an abstract class reference (`Shape`) to work with objects of concrete subclasses (`Circle`, `Rectangle`). Dynamic method dispatch ensures the correct overridden method (`calculateArea`) is called.
*   Providing a common structure (`Shape` defines `color`, `getColor`, `displayInfo`) while deferring specific calculations (`calculateArea`) to subclasses.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-017-abstract-class-shape` directory.
4.  Compile all Java files:
    ```bash
    javac *.java
    ```
    *(Compilation will fail if `Circle` or `Rectangle` do not implement `calculateArea`)*.
5.  Run the `AbstractDemo` class:
    ```bash
    java AbstractDemo
    ```
6.  Observe the output. Note that `Shape` cannot be instantiated. See how concrete subclasses provide the implementation for `calculateArea` and how polymorphism works with abstract class references.

## Example Output Snippet
```
--- Abstract Class Demo ---
Shape constructor called for color: Red
Circle constructor called.
Shape constructor called for color: Blue
Rectangle constructor called.
--- Processing Shapes Polymorphically ---
Circle Info:
Circle[Color=Red, Radius=5.0]
Color (via getter): Red
Area (via specific method): 78.53981633974483
Shape Color: Red
Calculated Area: 78.53981633974483
Rectangle Info:
Rectangle[Color=Blue, Width=4.0, Height=6.0]
Color (via getter): Blue
Area (via specific method): 24.0
Shape Color: Blue
Calculated Area: 24.0
--- Using an array ---
Processing shape from array:
Object Type: Circle
Color: Red
Area: 78.53981633974483
Shape Color: Red
Calculated Area: 78.53981633974483
Processing shape from array:
Object Type: Rectangle
Color: Blue
Area: 24.0
Shape Color: Blue
Calculated Area: 24.0