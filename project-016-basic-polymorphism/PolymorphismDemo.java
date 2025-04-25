public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("--- Polymorphism Demo ---");

        Animal[] pets = new Animal[3];

        pets[0] = new Dog("Buddy", 3, "Golden Retriever");
        pets[1] = new Cat("Whiskers", 2);
        pets[2] = new Dog("Max", 5, "Germon Sheperd");

        System.out.println("\n--- Iterating through pets array ---");

        // Using general for loop
        for (int i = 0; i < pets.length; i++) {
            System.out.println("\nProcessing Pet# " + (i + 1) + " : ");
            if (pets[i] != null) {
                System.out.println("Name: " + pets[i].getName());
                pets[i].eat();
                pets[i].makeSound();
            } else {
                System.out.println("Empty spot in pets array");
            }
        }

        // Using enhanced for loop
        for (Animal pet : pets) {
            if (pet != null) {
                System.out.println("\nProcessing " + pet.getName());
                pet.makeSound();
            }
        }

        System.out.println("\n-------------------------------------");
    }
}
