public class Dog extends Animal {

    private String breed;

    public String getBreed() {
        return this.breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        System.out.println("Dog constructor called");
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball");
    }

    @Override
    public String toString() {
        return "Dog [" + super.toString() + ", Breed= " + this.breed + "]";
    }
}
