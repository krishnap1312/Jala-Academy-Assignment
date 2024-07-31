public class EqualityOperators {

    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static boolean isNotEqual(int a, int b) {
        return a != b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Is equal: " + isEqual(num1, num2));
        System.out.println("Is not equal: " + isNotEqual(num1, num2));
    }
}
