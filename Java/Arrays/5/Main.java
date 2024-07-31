import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int elementToRemove = 30;
        int[] newArray = removeElement(numbers, elementToRemove);
        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }

    public static int[] removeElement(int[] array, int element) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num != element) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
