public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};
        System.out.println("Second largest number is: " + findSecondLargest(numbers));
    }

    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return second;
    }
}
