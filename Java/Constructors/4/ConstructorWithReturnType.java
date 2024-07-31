public class ConstructorWithReturnType {

    public ConstructorWithReturnType() {
        System.out.println("Constructor with no return type.");
    }

    public int getNumber() {
        return 42;
    }

    public String getMessage() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        ConstructorWithReturnType obj = new ConstructorWithReturnType();

        System.out.println("Number: " + obj.getNumber());
        System.out.println("Message: " + obj.getMessage());
    }
}
