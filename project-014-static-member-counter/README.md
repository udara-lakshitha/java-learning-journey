# Project 014: Static Member Example - Counter

This project demonstrates the use of `static` members (variables and methods) in Java. A `Counter` class is created to track the total number of `Counter` objects instantiated.

## Core Concepts Learned

*   **`static` keyword:** Declaring members that belong to the class itself, not individual objects.
*   **Static Variables (Class Variables):**
    *   Single copy shared by all instances (`objectCount`).
    *   Initialized when the class is loaded.
    *   Useful for shared state or constants.
*   **Static Methods (Class Methods):**
    *   Called using the class name (`Counter.getObjectCount()`).
    *   Cannot access instance members (non-static fields/methods) or `this` directly.
    *   Can access other static members directly.
*   **Instance Variables vs. Static Variables:** Understanding the difference in scope, memory allocation, and lifetime.
*   Incrementing a static counter within a constructor.
*   Best practice: Access static members via the class name, not an object reference.

## How to Run

1.  Ensure you have a Java Development Kit (JDK) installed.
2.  Open a terminal or command prompt.
3.  Navigate to the `project-014-static-member-counter` directory.
4.  Compile the Java code:
    ```bash
    javac Counter.java
    ```
5.  Run the compiled code:
    ```bash
    java Counter
    ```
6.  Observe the output, noting how the static `objectCount` increments globally while each object gets a unique `instanceNumber`. Pay attention to how static methods are called.

## Example Output Snippet
```
--- Static Member Demo ---
Initial object count (accessed via static method): 0
Creating Counter objects...
Counter object #1 created. Total objects: 1
Counter object #2 created. Total objects: 2
Counter object #3 created. Total objects: 3
--- Accessing Data ---
c1 instance number: 1
c2 instance number: 2
c3 instance number: 3
Object count via ClassName.staticMethod(): 3
Object count via c1.staticMethod(): 3
Object count via c2.staticMethod(): 3
Creating more objects...
Counter object #4 created. Total objects: 4
Final object count: 4
