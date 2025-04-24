# Project 011: Basic Class - Rectangle

This project introduces fundamental Object-Oriented Programming (OOP) concepts by defining and using a simple `Rectangle` class.

## Core Concepts Learned

*   **Classes:** Defining a blueprint (`Rectangle`) using the `class` keyword.
*   **Objects (Instances):** Creating objects from the class using `new Rectangle(...)`.
*   **Fields (Instance Variables):** Storing object state (`private double width`, `private double height`).
*   **Methods (Instance Methods):** Defining object behavior (`calculateArea()`, `calculatePerimeter()`, getters, setters).
*   **Constructors:** Initializing objects when they are created (`public Rectangle(...)`).
*   **`this` Keyword:** Referring to the current object's fields/methods within the class.
*   **Encapsulation:** Bundling data and methods, protecting internal state using `private` fields.
*   **Access Modifiers:** `public` (accessible anywhere) and `private` (accessible only within the class).
*   **Getters & Setters:** Providing controlled read/write access to private fields.
*   **Dot Operator (`.`):** Accessing methods and fields (via getters/setters) on object references.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-011-basic-class-rectangle` directory.
4.  Compile the Java code:
    ```bash
    javac Rectangle.java
    ```
5.  Run the compiled code (the `main` method is inside the `Rectangle` class):
    ```bash
    java Rectangle
    ```
6.  Observe the output demonstrating object creation, method calls, and state changes.

## Example Output Snippet
```
--- Rectangle Class Demo ---
Rectangle object created with width=5.0, height=10.0
Rectangle object created with width=3.5, height=7.2
Warning: Invalid width provided, setting to 1.0
Rectangle object created with width=1.0, height=12.0
--- Rectangle 1 ---
Width: 5.0
Height: 10.0
Area: 50.0
Perimeter: 30.0
... (output continues) ...
--- Modifying Rectangle 1 ---
Original width of rectangle1: 5.0
Error: Cannot set height to a non-positive value.
New width of rectangle1: 6.0
Height of rectangle1 (unchanged due to invalid set): 10.0
New Area of rectangle1: 60.0