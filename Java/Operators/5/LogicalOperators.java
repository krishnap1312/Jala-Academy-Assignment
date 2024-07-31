public class LogicalOperators {

    public static boolean logicalAnd(boolean a, boolean b) {
        return a && b;
    }

    public static boolean logicalOr(boolean a, boolean b) {
        return a || b;
    }

    public static boolean logicalNot(boolean a) {
        return !a;
    }

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("Logical AND (x && y): " + logicalAnd(x, y));
        System.out.println("Logical OR (x || y): " + logicalOr(x, y));
        System.out.println("Logical NOT (!x): " + logicalNot(x));
        System.out.println("Logical NOT (!y): " + logicalNot(y));
    }
}
