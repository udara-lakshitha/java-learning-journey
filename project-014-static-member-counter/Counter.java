public class Counter {

    private int instanceNumber;

    private static int objectCount = 0;

    public Counter() {
        objectCount++;
        this.instanceNumber = objectCount;
        System.out.println("Coounter object #" + this.instanceNumber + " created. Total objects: " + objectCount);
    }

    public int getInstanceNumber() {
        return this.instanceNumber;
    }

    public static int getObjectCount() {
        return objectCount;
    }
    public static void main(String[] args) {
        System.out.println("--- Static Memner Demo ---");
        System.out.println("Initial object count (accessed via static method): " + Counter.getObjectCount());

        System.out.println("\nCreating Counter Objects");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("\n--- Accessing Data ---");

        System.out.println("c1 instance number: " + c1.getInstanceNumber());
        System.out.println("c2 instance number: " + c2.getInstanceNumber());
        System.out.println("c3 instance number: " + c3.getInstanceNumber());

        System.out.println("Object count via ClassName.staticMethod():" + Counter.getObjectCount());

        // Possible but not recommended
        System.out.println("Object count via c1.staticMethod():" + c1.getObjectCount());
        System.out.println("Object count via c2.staticMethod():" + c2.getObjectCount());

        System.out.println("\nCreating more objects");
        Counter c4 = new Counter();
        System.out.println("Final Object Count: " + Counter.getObjectCount());

        System.out.println("\n--------------------------------------");
    }    
}
