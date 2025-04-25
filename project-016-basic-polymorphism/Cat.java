public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        System.out.println("Cat constructor called");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meow: Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " is scratching the post");
    }

    @Override
    public String toString() {
        return "Cat [" + super.toString() + "]";
    }
}
