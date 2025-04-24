public class PersonDemo {
    public static void main(String[] args) {
        System.out.println("--- Person class demo with constructor overloading ---");

        System.out.println("\nCreating person1 (Name and Age):");
        Person person1 = new Person("Alice", 30);

        System.out.println("\nCreating person2 (Name only):");
        Person person2 = new Person("Bob");

        System.out.println("\nCreating person3 (No arguments):");
        Person person3 = new Person();

        System.out.println("\nCreating person4 (Invalid age):");
        Person person4 = new Person("Charlie", -5);

        System.out.println("\nCreating person5 (Empty name):");
        Person person5 = new Person("", 25);

        System.out.println("\n--- Created Person Objects ---");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        System.out.println("\nAccessing data for " + person1.getName() + ":");
        System.out.println("Age: " + person1.getAge());

        System.out.println("\n----------------------------------");
    }    
}
