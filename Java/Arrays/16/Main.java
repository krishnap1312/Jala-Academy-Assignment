public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 30, 40};
        System.out.println("Difference between max and min: " + findDifference(numbers));
    }

    public static int findDifference(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}
