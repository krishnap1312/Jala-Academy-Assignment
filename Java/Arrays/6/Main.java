import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = copyArray(original);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }

    public static int[] copyArray(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
}
