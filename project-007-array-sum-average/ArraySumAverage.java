class ArraySumAverage {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20, 25, 30};
        int sum = 0;

        System.out.print("Array Elements : [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        double average = 0.0;
        if (nums.length > 1) {
            average = (double)sum / nums.length;
        }

        System.out.println("Sum of array elements : " + sum);
        System.out.println("Average of array elements : " + average);
    }
}