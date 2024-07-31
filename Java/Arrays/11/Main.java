import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        findCommonValues(array1, array2);
    }

    public static void findCommonValues(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        System.out.println("Common values: " + common);
    }
}
