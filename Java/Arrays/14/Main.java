public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] counts = countEvenOdd(numbers);
        System.out.println("Even numbers: " + counts[0]);
        System.out.println("Odd numbers: " + counts[1]);
    }

    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }
}
