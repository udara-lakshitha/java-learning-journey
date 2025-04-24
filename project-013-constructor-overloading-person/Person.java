public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        System.out.println("Person(String, int) constructor called");
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Warning: Name cannot be empty. Setting to 'Unknown'");
            this.name = "Unknown";
        } else {
            this.name = name;
        }
        if (age < 0) {
            System.out.println("Warning: Age cannot be negative. Setting to 0 for " + this.name);
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Person(String name) {
        this(name, 0);
        System.out.println("Person(String) constructor finished");
    }

    public Person() {
        this("Default Person");
        System.out.println("Person() constructor finished");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
