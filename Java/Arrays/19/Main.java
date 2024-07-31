public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10}; // Missing 6
        System.out.println("Missing number: " + findMissingNumber(numbers));
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int sumOfN = n * (n + 1) / 2;
        int sumOfArray = 0;

        for (int num : array) {
            sumOfArray += num;
        }

        return sumOfN - sumOfArray;
    }
}
