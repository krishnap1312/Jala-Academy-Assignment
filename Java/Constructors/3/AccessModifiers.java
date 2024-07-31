public class AccessModifiers {

    public AccessModifiers() {
        System.out.println("Public constructor.");
    }

    protected AccessModifiers(int a) {
        System.out.println("Protected constructor with value: " + a);
    }

    AccessModifiers(String b) {
        System.out.println("Default constructor with value: " + b);
    }

    private AccessModifiers(double c) {
        System.out.println("Private constructor with value: " + c);
    }

    public static void main(String[] args) {

        AccessModifiers obj1 = new AccessModifiers();

        AccessModifiers obj2 = new AccessModifiers(10);

        AccessModifiers obj3 = new AccessModifiers("Hello");

    }
}
