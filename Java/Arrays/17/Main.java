public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 15, 23, 30};
        System.out.println("Contains 12 and 23: " + containsTwoElements(numbers, 12, 23));
    }

    public static boolean containsTwoElements(int[] array, int elem1, int elem2) {
        boolean hasElem1 = false;
        boolean hasElem2 = false;

        for (int num : array) {
            if (num == elem1) {
                hasElem1 = true;
            }
            if (num == elem2) {
                hasElem2 = true;
            }
        }

        return hasElem1 && hasElem2;
    }
}
