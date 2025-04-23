public class FindMaxMin {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 15, 9, 0, 22, -8, 4};

        System.out.print("Array: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        if (numbers.length == 0) {
            System.out.println("Array is empty. Cannot find max or min");
        } else {
            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println("Maximum value : " + max);
            System.out.println("Minimum value : " + min);
        }
    }
}
