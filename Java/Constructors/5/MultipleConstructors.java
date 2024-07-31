public class MultipleConstructors {

    public MultipleConstructors() {
        System.out.println("Default constructor called.");
    }

    public MultipleConstructors(int a) {
        System.out.println("One-argument constructor called with value: " + a);
    }

    public static void main(String[] args) {

        MultipleConstructors obj = new MultipleConstructors();

        obj = new MultipleConstructors(30);
    }
}
