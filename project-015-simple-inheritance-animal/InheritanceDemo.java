public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Inheritance Demo ---");

        System.out.println("\nCreating Dog Object");
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        System.out.println("\nCreating a Cat Object");
        Cat myCat = new Cat("Whiskers", 2);

        System.out.println("\n--- Demonstrating Dog ---");
        System.out.println(myDog);
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.eat();
        myDog.makeSound();
        myDog.fetch();

        System.out.println("\n--- Demonstrating Cat ---");
        System.out.println(myCat);
        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        myCat.eat();
        myCat.makeSound();
        myCat.scratch();

        System.out.println("\n--------------------------------");
    }
}
