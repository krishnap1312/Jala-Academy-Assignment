import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int element = 3;
        int position = 2;
        int[] newArray = insertElement(array, element, position);
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }
}
