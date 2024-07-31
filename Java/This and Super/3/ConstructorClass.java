public class ConstructorClass {
    ConstructorClass() {
        this(10);
        System.out.println("Default Constructor");
    }

    ConstructorClass(int value) {
        System.out.println("Parameterized Constructor with value: " + value);
    }

    public static void main(String[] args) {
        new ConstructorClass();
    }
}
