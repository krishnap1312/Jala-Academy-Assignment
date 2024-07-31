public class ArgumentConstructorClass {
    ArgumentConstructorClass() {
        this("Default");
        System.out.println("Default Constructor");
    }

    ArgumentConstructorClass(String message) {
        System.out.println("Parameterized Constructor with message: " + message);
    }

    public static void main(String[] args) {
        new ArgumentConstructorClass();
    }
}
