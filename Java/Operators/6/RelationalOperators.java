public class RelationalOperators {

    public static boolean isLessThan(int a, int b) {
        return a < b;
    }

    public static boolean isLessThanOrEqual(int a, int b) {
        return a <= b;
    }

    public static boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    public static boolean isGreaterThanOrEqual(int a, int b) {
        return a >= b;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;

        System.out.println(num1 + " < " + num2 + " : " + isLessThan(num1, num2));
        System.out.println(num1 + " <= " + num2 + " : " + isLessThanOrEqual(num1, num2));
        System.out.println(num1 + " > " + num2 + " : " + isGreaterThan(num1, num2));
        System.out.println(num1 + " >= " + num2 + " : " + isGreaterThanOrEqual(num1, num2));
    }
}
