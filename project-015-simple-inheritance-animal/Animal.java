public class Animal {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Animal(String name, int age) {
        System.out.println("Animal constructor called for: " + name);
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; // default age
        }
    }

    public void eat() {
        System.out.println(this.name + " is eating");
    }

    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }

}