public class IncrementDecrementOperations {

    public static int increment(int a) {
        return ++a;
    }

    public static int decrement(int a) {
        return --a;
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("Original number: " + num);
        System.out.println("After increment: " + increment(num));
        System.out.println("After decrement: " + decrement(num));
    }
}
