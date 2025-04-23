class primitiveTypesDemo {
    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = 30000;
        int myInt = 2000000000;
        long myLong = 9000000000000000000L;

        float myFloat = 3.14f;
        double myDouble = 99.999;

        char myChar = 'A';
        char anotherChar = '7';
        char symbolChar = '$';

        boolean isJavaFun = true;
        boolean isFishFlying = false;

        System.out.println("---- Primitive data types demo ----");

        System.out.println("byte value : " + myByte);
        System.out.println("short value : " + myShort);
        System.out.println("int value : " + myInt);
        System.out.println("long value : " + myLong);

        System.out.println("float value : " + myFloat); 
        System.out.println("double value : " + myDouble);
        
        System.out.println("char value : " + myChar);
        System.out.println("another char value : " + anotherChar);
        System.out.println("symbol char : " + symbolChar);

        System.out.println("Is Java Fun ? " + isJavaFun);
        System.out.println("Is Fish Flying ? " + isFishFlying);
    }
}